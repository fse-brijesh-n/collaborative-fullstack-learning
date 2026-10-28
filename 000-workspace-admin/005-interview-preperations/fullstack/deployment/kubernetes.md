# Kubernetes Interview Q&A

## Overview
Kubernetes (K8s) is an open-source container orchestration platform that automates deployment, scaling, and management of containerized applications across clusters of machines.

---

## Interview Questions & Answers

1. **What is Kubernetes?**
   - Kubernetes is an open-source container orchestration platform that manages containerized applications across a cluster of machines, providing automated deployment, scaling, and operations.

2. **What are the main components of a Kubernetes cluster?**
   - Master/Control Plane (API Server, Scheduler, Controller Manager, etcd) and Worker Nodes (Kubelet, Container Runtime, kube-proxy).

3. **What is the difference between Docker and Kubernetes?**
   - Docker containerizes applications, while Kubernetes orchestrates and manages multiple Docker containers across a cluster.

4. **What is a Pod in Kubernetes?**
   - A Pod is the smallest deployable unit in Kubernetes, typically containing one or more containers (usually one) that share network namespace.

5. **What is a Node in Kubernetes?**
   - A Node is a worker machine (physical or virtual) that runs containerized applications managed by Kubernetes.

6. **What is the Control Plane in Kubernetes?**
   - The Control Plane manages the cluster state, including the API Server, Scheduler, Controller Manager, and etcd database.

7. **What is etcd in Kubernetes?**
   - etcd is a distributed key-value store that stores the entire Kubernetes cluster state and configuration data.

8. **What is the API Server in Kubernetes?**
   - The API Server is the central component that exposes the Kubernetes API and processes REST requests to manage cluster resources.

9. **What is the Scheduler in Kubernetes?**
   - The Scheduler is responsible for assigning Pods to Nodes based on resource requirements and scheduling policies.

10. **What is the Controller Manager?**
    - It runs controllers that regulate the state of the cluster, including ReplicaSet, Deployment, StatefulSet, and Service controllers.

11. **What is a Deployment in Kubernetes?**
    - A Deployment is a declarative way to manage Pods and ReplicaSets, providing updates and rollbacks.

12. **What is a ReplicaSet?**
    - A ReplicaSet ensures a specified number of Pod replicas are running at any given time.

13. **What is a StatefulSet?**
    - A StatefulSet manages Pods with persistent identity, stable network identity, and persistent storage.

14. **What is a DaemonSet?**
    - A DaemonSet ensures that a Pod runs on every Node (or a subset of Nodes) in the cluster.

15. **What is a Service in Kubernetes?**
    - A Service is an abstract way to expose Pods running on Kubernetes as a network service.

16. **What are the types of Services in Kubernetes?**
    - ClusterIP (default, internal only), NodePort (exposes on Node IP), LoadBalancer (external load balancer), and ExternalName.

17. **What is an Ingress in Kubernetes?**
    - An Ingress manages external HTTP/HTTPS access to Services, providing routing rules and SSL termination.

18. **What is a ConfigMap?**
    - A ConfigMap stores configuration data in key-value pairs, decoupling configuration from application code.

19. **What is a Secret in Kubernetes?**
    - A Secret stores sensitive data like passwords, API keys, and certificates in an encrypted manner.

20. **What is the difference between ConfigMap and Secret?**
    - ConfigMap stores non-sensitive configuration data, while Secret stores sensitive data and provides encryption.

21. **What is a PersistentVolume (PV)?**
    - A PersistentVolume is a cluster-wide resource for storing data independently of Pod lifecycle.

22. **What is a PersistentVolumeClaim (PVC)?**
    - A PersistentVolumeClaim is a request for storage resources by a Pod, binding to a PersistentVolume.

23. **What is a StorageClass?**
    - A StorageClass defines different types of storage (fast SSD, slow HDD) and provisions volumes dynamically.

24. **What is the difference between StatefulSet and Deployment?**
    - Deployments manage stateless applications with dynamic Pod identities, while StatefulSets manage stateful applications with stable identities.

25. **What is a Namespace in Kubernetes?**
    - A Namespace provides logical isolation of cluster resources, allowing multiple teams or projects to coexist.

26. **What are labels and selectors in Kubernetes?**
    - Labels are key-value pairs attached to objects for identification, while selectors are used to query and group objects by labels.

27. **What is a Helm chart?**
    - Helm is a package manager for Kubernetes that uses charts (pre-configured templates) to simplify application deployment.

28. **How do you perform a rolling update in Kubernetes?**
    - Use `kubectl set image deployment/<name> <container>=<image>` or update the Deployment spec to trigger a rolling update.

29. **What is the difference between a rolling update and blue-green deployment?**
    - Rolling update gradually replaces old Pods with new ones, while blue-green deployment switches entire version at once.

30. **What is a resource limit in Kubernetes?**
    - Resource limits define CPU and memory constraints for containers to ensure fair resource allocation.

31. **What is a resource request in Kubernetes?**
    - Resource requests specify the minimum CPU and memory required for a Pod to be scheduled.

32. **What is the difference between resource requests and limits?**
    - Requests are minimum guaranteed resources, while limits are maximum allowed resources.

33. **What is a Readiness Probe?**
    - A Readiness Probe checks if a Pod is ready to receive traffic, affecting Service endpoint inclusion.

34. **What is a Liveness Probe?**
    - A Liveness Probe checks if a Pod is alive, restarting it if the probe fails.

35. **What is a Startup Probe?**
    - A Startup Probe checks if an application has started, delaying other probes until success.

36. **What is Horizontal Pod Autoscaling (HPA)?**
    - HPA automatically scales the number of Pod replicas based on CPU utilization or custom metrics.

37. **What is Vertical Pod Autoscaling (VPA)?**
    - VPA automatically adjusts resource requests and limits based on actual usage.

38. **What is Network Policy in Kubernetes?**
    - Network Policy defines rules for incoming and outgoing traffic between Pods.

39. **What is a ClusterRole in Kubernetes?**
    - A ClusterRole is a set of permissions defined at the cluster level, granting access to cluster-wide resources.

40. **What is a Role in Kubernetes?**
    - A Role is a set of permissions scoped to a specific Namespace.

41. **What is a RoleBinding?**
    - A RoleBinding grants permissions defined in a Role to a user, group, or service account within a Namespace.

42. **What is a ClusterRoleBinding?**
    - A ClusterRoleBinding grants permissions defined in a ClusterRole at the cluster level.

43. **What is RBAC (Role-Based Access Control) in Kubernetes?**
    - RBAC is a method of regulating access to Kubernetes resources based on user roles and permissions.

44. **What is Service Account in Kubernetes?**
    - A Service Account provides an identity for Pods to authenticate with the API Server.

45. **How do you debug a Pod in Kubernetes?**
    - Use `kubectl logs <pod>`, `kubectl describe pod <pod>`, `kubectl exec -it <pod> -- /bin/sh`, or `kubectl debug`.

46. **What is a Job in Kubernetes?**
    - A Job creates Pods to perform a task and ensures the Pod completes successfully.

47. **What is a CronJob in Kubernetes?**
    - A CronJob schedules Jobs to run periodically based on a cron schedule.

48. **What is the difference between Job and CronJob?**
    - Jobs run once or a specified number of times, while CronJobs run on a schedule.

49. **What is a webhook in Kubernetes?**
    - A webhook is an HTTP callback that Kubernetes invokes to validate or mutate resources (e.g., ValidatingWebhook, MutatingWebhook).

50. **How do you upgrade a Kubernetes cluster?**
    - Update the Control Plane components first (API Server, Scheduler, Controller Manager), then update Nodes using `kubeadm upgrade` or managed service providers.

51. **What is a Custom Resource Definition (CRD)?**
    - A CRD extends Kubernetes API to define custom resources specific to your application needs.

52. **What is an Operator in Kubernetes?**
    - An Operator is a Kubernetes controller that manages complex applications using CRDs and domain knowledge.

53. **What is GitOps in Kubernetes?**
    - GitOps is a practice where Git is the single source of truth for cluster state, with automated synchronization.

54. **What is the difference between Kubernetes and Docker Swarm?**
    - Kubernetes is more feature-rich with advanced orchestration, while Docker Swarm is simpler and easier to learn.

55. **What is a Sidecar in Kubernetes?**
    - A Sidecar is an additional container in a Pod that augments the primary container's functionality (e.g., logging, monitoring).

56. **What is Init Container in Kubernetes?**
    - Init Containers run before app containers start, used for setup tasks like initialization or waiting for dependencies.

57. **What is Affinity in Kubernetes?**
    - Affinity defines Pod scheduling rules based on Node labels or inter-Pod relationships.

58. **What is Taint and Toleration in Kubernetes?**
    - Taints prevent Pods from being scheduled on Nodes, while Tolerations allow Pods to be scheduled on tainted Nodes.

59. **What is Pod Disruption Budget (PDB)?**
    - PDB specifies minimum available Pods during voluntary disruptions (e.g., node maintenance, cluster upgrades).

60. **How do you implement Zero-Downtime Deployments in Kubernetes?**
    - Use rolling updates with proper readiness probes, Pod disruption budgets, and graceful shutdown handling.

---

## Key Concepts

### Cluster Architecture
- **Master/Control Plane**: Manages cluster state
- **Worker Nodes**: Run containerized applications
- **Communication**: API Server is the central hub

### Pod Management
- Smallest deployable unit
- Can contain one or more containers
- Containers share network namespace

### Workload Resources
- **Deployment**: Stateless applications
- **StatefulSet**: Stateful applications with persistent identity
- **DaemonSet**: Runs on every node
- **Job**: One-time tasks
- **CronJob**: Scheduled tasks

### Networking
- **Services**: Expose Pods internally/externally
- **Ingress**: External HTTP/HTTPS access
- **Network Policies**: Control traffic flow

### Storage
- **PersistentVolume**: Cluster resource for storage
- **PersistentVolumeClaim**: Storage request
- **StorageClass**: Dynamic provisioning

### Configuration
- **ConfigMap**: Non-sensitive data
- **Secret**: Sensitive data
- **Namespace**: Logical isolation

---

## Best Practices

1. Use resource requests and limits for every container
2. Implement health checks (readiness, liveness, startup probes)
3. Use PodDisruptionBudgets for high availability
4. Implement RBAC for security
5. Use Network Policies to control traffic
6. Monitor and log applications with tools like Prometheus and ELK
7. Use labels and selectors for organization
8. Implement GitOps workflows
9. Automate deployments using CI/CD pipelines
10. Use Helm charts for templating complex deployments

---

## Common Mistakes

1. Not setting resource requests/limits, causing evictions
2. Forgetting readiness probes, serving traffic before ready
3. Running all Pods on one Node, no high availability
4. Not using health checks, missing failed containers
5. Exposing sensitive data in ConfigMaps instead of Secrets
6. Over-complicated deployments without proper documentation
7. Ignoring network policies, security risks
8. Poor Pod scheduling strategies
9. Not using persistent storage properly
10. Inadequate monitoring and logging setup

---

## Performance Optimization

1. Use HPA for automatic scaling based on metrics
2. Optimize resource requests and limits
3. Use image registries in same region as cluster
4. Implement caching strategies
5. Use efficient container images (minimal base images)
6. Monitor metrics using Prometheus
7. Use node affinity for optimal pod placement
8. Implement PV caching for stateful applications
9. Use init containers for pre-startup tasks
10. Profile applications for bottlenecks

---

## Debugging Tips

1. **Pod not running**: Check `kubectl describe pod <pod>` for events
2. **Pod pending**: Usually resource constraints; check node resources
3. **CrashLoopBackOff**: App crashes; check logs with `kubectl logs <pod>`
4. **ImagePullBackOff**: Cannot pull image; verify registry credentials
5. **Connection refused**: Service not ready; check readiness probe
6. **Use exec for interactive debugging**: `kubectl exec -it <pod> -- /bin/sh`
7. **Check node status**: `kubectl get nodes` and `kubectl describe node <node>`
8. **View events**: `kubectl get events` for cluster-wide issues

---

## Summary

Kubernetes is essential for modern DevOps. Master cluster architecture, workload resources, networking, storage, and security. Understand deployment strategies, monitoring, and troubleshooting. Focus on best practices like resource limits, health checks, and RBAC.

---

## References

- [Kubernetes Official Documentation](https://kubernetes.io/docs/)
- [Kubernetes API Reference](https://kubernetes.io/docs/reference/kubernetes-api/)
- [kubectl Cheat Sheet](https://kubernetes.io/docs/reference/kubectl/cheatsheet/)
