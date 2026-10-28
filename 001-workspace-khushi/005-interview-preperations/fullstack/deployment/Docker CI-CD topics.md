Docker & CI/CD Pipeline with GitHub Actions to Ubuntu VPS – Complete In‑Depth Guide

This guide covers everything from Docker basics to advanced containerization, Docker Compose, and building a full CI/CD pipeline using GitHub Actions to deploy to an Ubuntu cloud VPS. Each topic is broken down with explanations, practical commands, and real‑world code snippets. It is designed to take you from zero to production‑ready deployment.

---

Table of Contents

1. Introduction to Containerization and Docker
2. Docker Architecture and Installation
3. Docker Images and Containers – Core Concepts
   · 3.1 Images, Layers, and Registries
   · 3.2 Running and Managing Containers
   · 3.3 Essential Docker Commands
4. Dockerfile – Building Your Own Images
   · 4.1 All Dockerfile Instructions Explained
   · 4.2 Multi‑Stage Builds
   · 4.3 Best Practices and Optimizations
5. Docker Compose – Multi‑Container Applications
   · 5.1 docker-compose.yml Structure
   · 5.2 Services, Networks, Volumes, and Environment
   · 5.3 Development vs Production Compose Files
6. Docker Networking Deep Dive
7. Docker Volumes and Persistent Data
8. Building a Production‑Ready Spring Boot Docker Image
   · 8.1 Traditional Dockerfile with Layered JARs
   · 8.2 Using Cloud Native Buildpacks (Spring Boot Maven Plugin)
9. Docker Security Best Practices
10. Introduction to GitHub Actions
    · 10.1 Workflows, Jobs, Steps, and Events
    · 10.2 Runners and Contexts
    · 10.3 Secrets and Environment Variables
11. Setting Up the CI/CD Pipeline
    · 11.1 Workflow Overview
    · 11.2 Step 1: Checkout Code
    · 11.3 Step 2: Set Up Java and Build
    · 11.4 Step 3: Run Tests
    · 11.5 Step 4: Build and Push Docker Image
    · 11.6 Step 5: Deploy to Ubuntu VPS
12. Preparing the Ubuntu VPS for Deployment
    · 12.1 Installing Docker and Docker Compose
    · 12.2 Setting Up SSH Access for GitHub Actions
    · 12.3 Configuring Firewall and Security Groups
13. Zero‑Downtime Deployment Strategies
    · 13.1 Docker Compose Rolling Update
    · 13.2 Blue‑Green Deployment with Docker
14. Advanced Docker Topics
    · 14.1 Docker BuildKit and Layer Caching
    · 14.2 Image Scanning (Trivy, Snyk)
    · 14.3 Health Checks in Docker
    · 14.4 Docker Swarm (Brief Overview)
15. Monitoring and Logging
16. Full CI/CD Workflow File Example
17. Common Pitfalls and Best Practices
18. Interview Questions

---

1. Introduction to Containerization and Docker

Containerization is a lightweight alternative to full machine virtualization that encapsulates an application and its dependencies into a self‑contained unit called a container. Containers share the host OS kernel but run in isolated user spaces.

Docker is the most popular containerization platform. It packages software into standardized units for development, shipment, and deployment.

Why containers?

· Consistency – “works on my machine” problem solved.
· Isolation – each container has its own filesystem, network, and processes.
· Efficiency – containers share the host kernel; start in seconds; much smaller than VMs.
· Portability – run anywhere: laptop, data center, cloud.
· DevOps enabler – same artifact from development to production.

---

2. Docker Architecture and Installation

Docker uses a client‑server architecture:

· Docker daemon (dockerd) – runs on the host, manages images, containers, networks, and volumes.
· Docker client (docker) – command‑line tool that talks to the daemon via REST API (over Unix socket or TCP).
· Docker registry – stores Docker images (e.g., Docker Hub, private registries).

Installation on Ubuntu (quick steps):

```bash
sudo apt update
sudo apt install -y ca-certificates curl
sudo install -m 0755 -d /etc/apt/keyrings
sudo curl -fsSL https://download.docker.com/linux/ubuntu/gpg -o /etc/apt/keyrings/docker.asc
echo "deb [arch=$(dpkg --print-architecture) signed-by=/etc/apt/keyrings/docker.asc] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable" | sudo tee /etc/apt/sources.list.d/docker.list > /dev/null
sudo apt update
sudo apt install -y docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin
sudo usermod -aG docker $USER   # run docker without sudo (re‑login required)
```

---

3. Docker Images and Containers – Core Concepts

3.1 Images, Layers, and Registries

· Image – a read‑only template with instructions to create a container. Built in layers (each instruction in Dockerfile adds a layer). Layers are cached and shared across images.
· Container – a runnable instance of an image. It adds a thin writable layer on top of the image layers.
· Registry – a repository for images (Docker Hub, Amazon ECR, GitHub Container Registry).

3.2 Running and Managing Containers

```bash
docker run -d --name myapp -p 8080:8080 myapp:1.0
docker ps                    # list running containers
docker ps -a                 # all containers
docker stop myapp
docker start myapp
docker restart myapp
docker rm myapp              # remove stopped container
docker exec -it myapp bash   # get a shell inside a running container
docker logs -f myapp         # follow logs
docker inspect myapp         # detailed info
```

3.3 Essential Docker Commands

· Image management: docker images, docker pull, docker push, docker rmi, docker tag
· Cleanup: docker system prune -a (remove unused containers, images, networks, build cache)
· Port mapping: -p host_port:container_port
· Environment variables: -e VAR=value or --env-file file.env
· Volumes: -v host_path:container_path (bind mount) or --mount source=vol_name,target=/path

---

4. Dockerfile – Building Your Own Images

A Dockerfile is a text file with instructions to assemble an image.

4.1 All Dockerfile Instructions Explained

Instruction Purpose
FROM Base image
RUN Execute commands in a new layer (e.g., install packages)
COPY / ADD Copy files from host to image (ADD can also extract TARs and fetch URLs)
CMD Default command to run when container starts (can be overridden)
ENTRYPOINT Makes container run as executable (not easily overridden)
ENV Set environment variables
WORKDIR Set working directory for subsequent instructions
EXPOSE Document the port the container listens on (does not publish)
VOLUME Create a mount point for external volumes
USER Switch user for running the process
ARG Build‑time variables (not available at runtime)
LABEL Add metadata
HEALTHCHECK Define a command to check container health
SHELL Override default shell

Example – Simple Dockerfile for a Spring Boot app:

```dockerfile
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY target/myapp.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
```

4.2 Multi‑Stage Builds

Separate build and runtime environments to reduce image size.

```dockerfile
# Stage 1: Build
FROM maven:3.8.7-eclipse-temurin-17 AS builder
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -B
COPY src ./src
RUN mvn package -DskipTests

# Stage 2: Runtime
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
```

4.3 Best Practices and Optimizations

· Minimize layers: combine RUN commands, remove temporary files in the same layer.
· Use .dockerignore to exclude unnecessary files (like .git, target/ except the jar).
· Order from least to most frequently changing – place dependencies installation before copying source code to leverage build cache.
· Don't run as root – create a non‑root user: RUN addgroup -S appgroup && adduser -S appuser -G appgroup and USER appuser.
· Use specific base image tags instead of latest.
· Leverage BuildKit for faster builds (DOCKER_BUILDKIT=1 docker build).

---

5. Docker Compose – Multi‑Container Applications

Docker Compose allows you to define and run multi‑container applications using a YAML file.

5.1 docker-compose.yml Structure

```yaml
version: '3.8'
services:
  app:
    build: .
    ports:
      - "8080:8080"
    environment:
      - SPRING_PROFILES_ACTIVE=prod
    depends_on:
      - db
    networks:
      - mynet
  db:
    image: postgres:15-alpine
    environment:
      POSTGRES_DB: mydb
      POSTGRES_USER: user
      POSTGRES_PASSWORD: secret
    volumes:
      - pgdata:/var/lib/postgresql/data
    networks:
      - mynet
volumes:
  pgdata:
networks:
  mynet:
```

5.2 Services, Networks, Volumes, and Environment

· Services – each container definition.
· depends_on – controls startup order (does not wait for service readiness).
· networks – services on the same network can resolve each other by service name.
· volumes – named volumes persist data (Docker manages the storage location).

5.3 Development vs Production Compose Files

Use multiple Compose files: docker compose -f docker-compose.yml -f docker-compose.prod.yml up -d. Override settings per environment.

---

6. Docker Networking Deep Dive

Network drivers:

· bridge (default) – isolated network on the host, containers communicate via IP.
· host – container shares host’s network (no isolation).
· overlay – for multi‑host Docker Swarm.
· none – disable networking.
· macvlan – assign a MAC address to container, making it appear as physical device.

User‑defined bridge networks provide automatic DNS resolution between containers by container name.

Create network: docker network create mynet.
Connect a running container: docker network connect mynet container_name.

---

7. Docker Volumes and Persistent Data

· Volumes – managed by Docker (/var/lib/docker/volumes/), recommended for persistence.
· Bind mounts – any host path mounted into container.
· tmpfs mounts – stored in memory, ephemeral.

```bash
docker volume create myvol
docker run -v myvol:/data myimage
```

In Compose: volumes: myvol: with top‑level volumes: myvol: definition.

---

8. Building a Production‑Ready Spring Boot Docker Image

8.1 Traditional Dockerfile with Layered JARs

Spring Boot Maven plugin can extract layers from the fat JAR to improve caching during rebuilds.

pom.xml:

```xml
<plugin>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-maven-plugin</artifactId>
    <configuration>
        <layers>
            <enabled>true</enabled>
        </layers>
    </configuration>
</plugin>
```

Then create a layered jar and copy layers separately in Dockerfile:

```dockerfile
FROM eclipse-temurin:17-jre-alpine as builder
WORKDIR /app
COPY target/*.jar app.jar
RUN java -Djarmode=layertools -jar app.jar extract

FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=builder /app/dependencies/ ./
COPY --from=builder /app/spring-boot-loader/ ./
COPY --from=builder /app/snapshot-dependencies/ ./
COPY --from=builder /app/application/ ./
ENTRYPOINT ["java", "org.springframework.boot.loader.JarLauncher"]
```

8.2 Using Cloud Native Buildpacks

Spring Boot 2.3+ supports building OCI images directly with Maven/Gradle plugin – no Dockerfile needed.

```bash
mvn spring-boot:build-image -Dspring-boot.build-image.imageName=myapp:latest
```

The plugin uses Cloud Native Buildpacks to create a small, secure, and optimized image.

---

9. Docker Security Best Practices

· Use minimal base images (Alpine, distroless).
· Run as non‑root user (avoid USER root).
· Scan images for vulnerabilities (Trivy, Snyk, Docker Scout).
· Do not leak secrets in image layers (never COPY .env or ENV SECRET – use runtime secrets).
· Limit capabilities: docker run --cap-drop=ALL --cap-add=NET_BIND_SERVICE.
· Use read‑only root filesystem (--read-only) where possible.
· Keep host and Docker up‑to‑date.

---

10. Introduction to GitHub Actions

GitHub Actions is a CI/CD platform that automates build, test, and deployment pipelines directly from your repository.

10.1 Workflows, Jobs, Steps, and Events

· Workflow – defined in .github/workflows/*.yml, triggered by events.
· Event – push, pull_request, schedule, workflow_dispatch.
· Job – set of steps that run on a runner (Linux, Windows, macOS) or self‑hosted runner.
· Step – an individual task; can run a script or use a pre‑built action.

10.2 Runners and Contexts

GitHub provides hosted runners (ubuntu‑latest, windows‑latest). Self‑hosted runners for custom hardware.

Contexts provide information about workflow run, jobs, etc. (${{ github.ref }}, ${{ secrets.SERVER_SSH_KEY }}).

10.3 Secrets and Environment Variables

Store sensitive values in repository settings → Secrets. Access via ${{ secrets.SECRET_NAME }}.
Environment variables can be set at workflow, job, or step level.

---

11. Setting Up the CI/CD Pipeline

11.1 Workflow Overview

A typical Spring Boot microservice pipeline:

1. Trigger: push to main branch (or PR).
2. Build & Test: checkout code, set up Java, run Maven build + tests.
3. Package: build Docker image and tag it.
4. Push: push image to a container registry (Docker Hub, GitHub Container Registry).
5. Deploy: SSH into VPS, pull new image, restart container(s) with Docker Compose.

11.2 Step 1: Checkout Code

```yaml
steps:
  - uses: actions/checkout@v4
```

11.3 Step 2: Set Up Java and Build

```yaml
  - name: Set up JDK 17
    uses: actions/setup-java@v4
    with:
      java-version: '17'
      distribution: 'temurin'
  - name: Build with Maven
    run: mvn clean package -DskipTests
```

11.4 Step 3: Run Tests

```yaml
  - name: Run tests
    run: mvn test
```

11.5 Step 4: Build and Push Docker Image

```yaml
  - name: Log in to Docker Hub
    uses: docker/login-action@v3
    with:
      username: ${{ secrets.DOCKER_USERNAME }}
      password: ${{ secrets.DOCKER_PASSWORD }}
  - name: Build and push Docker image
    uses: docker/build-push-action@v5
    with:
      context: .
      push: true
      tags: ${{ secrets.DOCKER_USERNAME }}/myapp:latest, ${{ secrets.DOCKER_USERNAME }}/myapp:${{ github.sha }}
```

11.6 Step 5: Deploy to Ubuntu VPS

Use SSH to connect, copy the updated docker‑compose file, pull the new image, and restart.

```yaml
  - name: Deploy to VPS
    uses: appleboy/ssh-action@v1.0.0
    with:
      host: ${{ secrets.VPS_HOST }}
      username: ${{ secrets.VPS_USERNAME }}
      key: ${{ secrets.VPS_SSH_KEY }}
      script: |
        cd /opt/myapp
        docker compose pull
        docker compose up -d --remove-orphans
        docker image prune -f
```

---

12. Preparing the Ubuntu VPS for Deployment

12.1 Installing Docker and Docker Compose

On the VPS (Ubuntu 22.04/24.04), install Docker as shown in section 2. Docker Compose is now a plugin (docker compose). Optionally install standalone docker-compose if needed.

12.2 Setting Up SSH Access for GitHub Actions

1. Generate an SSH key pair on your local machine or directly on the VPS:
   ```bash
   ssh-keygen -t ed25519 -C "github-actions" -f ~/.ssh/github_actions
   ```
2. Add the public key to ~/.ssh/authorized_keys on the VPS:
   ```bash
   cat ~/.ssh/github_actions.pub >> ~/.ssh/authorized_keys
   ```
3. In GitHub repository settings → Secrets, add:
   · VPS_HOST – your server IP or domain.
   · VPS_USERNAME – e.g., ubuntu.
   · VPS_SSH_KEY – the private key content (cat ~/.ssh/github_actions).

Ensure the directory /opt/myapp (or your project path) exists with correct permissions.

12.3 Configuring Firewall and Security Groups

Allow only necessary ports: 22 (SSH), 80 (HTTP), 443 (HTTPS), and optionally application port if not behind a reverse proxy.

Use ufw on Ubuntu:

```bash
sudo ufw allow 22/tcp
sudo ufw allow 80/tcp
sudo ufw allow 443/tcp
sudo ufw enable
```

In cloud environments (AWS, GCP, Azure), also configure security group rules.

---

13. Zero‑Downtime Deployment Strategies

13.1 Docker Compose Rolling Update

The command docker compose up -d will only recreate containers if the configuration or image has changed. But to ensure a new image is pulled, first docker compose pull. This works well for stateless services; for stateful services, additional care is needed.

To avoid downtime, you can temporarily scale up the service before restarting, but in many cases a simple docker compose up -d with a proper health check ensures minimal disruption.

13.2 Blue‑Green Deployment with Docker

Use two identical environments (e.g., app-blue and app-green). Deploy the new version to the inactive environment, test, then switch traffic by updating a reverse proxy (Nginx) or swapping port mappings.

Simplified example with Nginx:

1. Run new version on a different port.
2. Update Nginx config to point to the new port.
3. Reload Nginx (nginx -s reload).
4. Stop old container.

This can be automated in the GitHub Actions script.

---

14. Advanced Docker Topics

14.1 Docker BuildKit and Layer Caching

BuildKit provides parallel building, better caching, and secret mounts. It's enabled by default in recent Docker versions. In CI, use GitHub Actions cache to store Docker layers across runs.

Cache with docker/build-push-action:

```yaml
- name: Build and push
  uses: docker/build-push-action@v5
  with:
    context: .
    push: true
    tags: ...
    cache-from: type=gha
    cache-to: type=gha,mode=max
```

14.2 Image Scanning

Integrate vulnerability scanning into your pipeline:

· Trivy: docker run aquasec/trivy image myimage:tag
· Snyk: snyk container test myimage:tag

Add as a step after build:

```yaml
- name: Scan image
  uses: aquasecurity/trivy-action@master
  with:
    image-ref: ${{ secrets.DOCKER_USERNAME }}/myapp:${{ github.sha }}
    format: 'table'
    exit-code: '1'
```

14.3 Health Checks in Docker

Define in Dockerfile:

```dockerfile
HEALTHCHECK --interval=30s --timeout=3s --retries=3 CMD curl -f http://localhost:8080/actuator/health || exit 1
```

Or in Compose:

```yaml
healthcheck:
  test: ["CMD", "curl", "-f", "http://localhost:8080/actuator/health"]
  interval: 30s
  timeout: 10s
  retries: 3
```

This allows Docker to restart unhealthy containers and inform the load balancer.

14.4 Docker Swarm (Brief Overview)

Docker Swarm provides native clustering and orchestration. Commands: docker swarm init, docker service create. Often, Kubernetes is the preferred orchestrator, but Swarm can be a simpler alternative for small setups.

---

15. Monitoring and Logging

· docker stats – live CPU/memory/network of containers.
· docker logs – container logs. Use log drivers to ship logs to centralized systems (ELK, Loki, Datadog).
· cAdvisor + Prometheus + Grafana for comprehensive container monitoring.

---

16. Full CI/CD Workflow File Example

```yaml
name: CI/CD Pipeline

on:
  push:
    branches: [ main ]

jobs:
  build-and-deploy:
    runs-on: ubuntu-latest

    steps:
      - name: Checkout code
        uses: actions/checkout@v4

      - name: Set up JDK 17
        uses: actions/setup-java@v4
        with:
          java-version: '17'
          distribution: 'temurin'

      - name: Build with Maven
        run: mvn clean package -DskipTests

      - name: Run tests
        run: mvn test

      - name: Log in to Docker Hub
        uses: docker/login-action@v3
        with:
          username: ${{ secrets.DOCKER_USERNAME }}
          password: ${{ secrets.DOCKER_PASSWORD }}

      - name: Set up Docker Buildx
        uses: docker/setup-buildx-action@v3

      - name: Build and push Docker image
        uses: docker/build-push-action@v5
        with:
          context: .
          push: true
          tags: |
            ${{ secrets.DOCKER_USERNAME }}/myapp:latest
            ${{ secrets.DOCKER_USERNAME }}/myapp:${{ github.sha }}
          cache-from: type=gha
          cache-to: type=gha,mode=max

      - name: Scan image for vulnerabilities
        uses: aquasecurity/trivy-action@master
        with:
          image-ref: ${{ secrets.DOCKER_USERNAME }}/myapp:${{ github.sha }}
          format: 'table'
          exit-code: '0'   # set to 1 to fail on critical

      - name: Deploy to VPS
        uses: appleboy/ssh-action@v1.0.0
        with:
          host: ${{ secrets.VPS_HOST }}
          username: ${{ secrets.VPS_USERNAME }}
          key: ${{ secrets.VPS_SSH_KEY }}
          script: |
            cd /opt/myapp
            echo "DOCKER_USERNAME=${{ secrets.DOCKER_USERNAME }}" > .env
            docker compose pull
            docker compose up -d --remove-orphans
            docker image prune -f
```

---

17. Common Pitfalls and Best Practices

· Never commit secrets to Git; use GitHub Secrets.
· Use specific image tags in production (not latest).
· Minimize image size: use Alpine, multi‑stage, and .dockerignore.
· Health checks for reliable deployments.
· Backup persistent volumes regularly.
· Rotate SSH keys and use individual keys per service.
· Test the pipeline on a separate branch before merging to main.
· Use docker compose instead of docker-compose (standalone) for better integration.
· Monitor for leaked secrets with tools like git-secrets or GitHub secret scanning.

---

18. Interview Questions

1. What is Docker, and how does it differ from a virtual machine?
2. Explain the Docker image build process and layers.
3. What is a Dockerfile, and what are the key instructions?
4. How does Docker Compose work? What is the difference between docker-compose and docker compose?
5. How do you persist data in Docker? Volumes vs bind mounts.
6. What are the different Docker network modes?
7. How would you optimize a Dockerfile for smaller size and faster builds?
8. Explain the concept of multi‑stage builds.
9. What is the purpose of .dockerignore?
10. How do you scan Docker images for vulnerabilities?
11. What is GitHub Actions, and how do you set up a CI/CD pipeline?
12. How do you securely deploy to a VPS using GitHub Actions?
13. What is a blue‑green deployment, and how can you implement it with Docker?
14. How does Docker layer caching work in CI?
15. Explain the health check mechanism in Docker.
16. How do you handle zero‑downtime deployments?
17. What are the differences between Docker Swarm and Kubernetes?
18. How do you manage secrets in Docker and CI/CD?

---

This guide provides a comprehensive, practical path from Docker basics to advanced CI/CD with GitHub Actions and Ubuntu VPS deployment. With these foundations, you can confidently containerize, automate, and deploy applications in a production‑grade manner.
