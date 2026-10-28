# AWS & Cloud Computing Interview Q&A

## Overview
AWS and Cloud Computing cover core services (EC2, S3, RDS, Lambda), deployment models, scalability, security, and best practices for building cloud-native applications.

---

## Interview Questions & Answers

1. **What is Cloud Computing?**
   - On-demand computing resources (compute, storage, networking) delivered over internet with pay-as-you-go pricing.

2. **What are Cloud Deployment Models?**
   - Public cloud (AWS, Azure, GCP), Private cloud, Hybrid cloud, Multi-cloud.

3. **What are Cloud Service Models?**
   - IaaS (Infrastructure), PaaS (Platform), SaaS (Software).

4. **What is IaaS?**
   - Virtualized computing resources over internet (EC2, Azure VMs).

5. **What is PaaS?**
   - Platform for developing, deploying applications (Heroku, AWS Elastic Beanstalk).

6. **What is SaaS?**
   - Software delivered over internet (Salesforce, Office 365).

7. **What is AWS?**
   - Amazon Web Services - leading cloud provider with 200+ services.

8. **What is EC2?**
   - Elastic Compute Cloud - virtual machines in cloud.

9. **What is S3?**
   - Simple Storage Service - object storage for files, backups, data lakes.

10. **What is RDS?**
    - Relational Database Service - managed relational databases.

11. **What is Lambda?**
    - Serverless compute service executing code without managing servers.

12. **What are Lambda Triggers?**
    - Events triggering Lambda execution (S3, DynamoDB, SNS).

13. **What is CloudFront?**
    - CDN (Content Delivery Network) for low-latency content delivery.

14. **What is VPC?**
    - Virtual Private Cloud - isolated network environment.

15. **What is Subnet?**
    - Segment of VPC with own CIDR block.

16. **What is Security Group?**
    - Virtual firewall controlling inbound/outbound traffic.

17. **What is IAM?**
    - Identity and Access Management for users, roles, permissions.

18. **What is IAM Role?**
    - Set of permissions assumed by AWS services.

19. **What is IAM Policy?**
    - JSON document defining permissions.

20. **What is DynamoDB?**
    - NoSQL database service for high-scale applications.

21. **What is SQS?**
    - Simple Queue Service - message queue for decoupling.

22. **What is SNS?**
    - Simple Notification Service - pub/sub messaging.

23. **What is Auto Scaling?**
    - Automatically adjusting capacity based on demand.

24. **What is ELB?**
    - Elastic Load Balancer - distributing traffic across instances.

25. **What is CloudWatch?**
    - Monitoring and observability service for metrics and logs.

26. **What is CloudTrail?**
    - Logging API calls for audit and compliance.

27. **What is KMS?**
    - Key Management Service for encryption key management.

28. **What is Secrets Manager?**
    - Storing and rotating secrets like passwords and API keys.

29. **What is CodePipeline?**
    - CI/CD service automating deployment pipeline.

30. **What is CodeBuild?**
    - Managed build service for compiling, testing code.

31. **What is CodeDeploy?**
    - Service automating code deployment to instances.

32. **What is ECR?**
    - Elastic Container Registry for Docker images.

33. **What is ECS?**
    - Elastic Container Service for running Docker containers.

34. **What is EKS?**
    - Elastic Kubernetes Service - managed Kubernetes.

35. **What is Elastic Beanstalk?**
    - PaaS for deploying web applications.

36. **What is CloudFormation?**
    - Infrastructure as Code service for defining AWS resources.

37. **What is SAM?**
    - Serverless Application Model for defining serverless applications.

38. **What is Athena?**
    - Query service for analyzing data in S3.

39. **What is Redshift?**
    - Data warehouse for large-scale analytics.

40. **What is SageMaker?**
    - Managed service for machine learning.

41. **What is EventBridge?**
    - Event routing service connecting applications.

42. **What is Step Functions?**
    - Workflow orchestration service for complex processes.

43. **What is AppSync?**
    - Managed GraphQL service for APIs.

44. **What is Route53?**
    - DNS service for domain routing.

45. **What is CloudFront Distribution?**
    - Configuration for CDN content delivery.

46. **What is S3 Bucket?**
    - Container for storing objects in S3.

47. **What is S3 Versioning?**
    - Keeping multiple versions of objects.

48. **What is S3 Replication?**
    - Copying objects to another bucket/region.

49. **What is Glacier?**
    - Low-cost storage for long-term archive.

50. **What is RTO (Recovery Time Objective)?**
    - Maximum acceptable downtime.

51. **What is RPO (Recovery Point Objective)?**
    - Maximum acceptable data loss.

52. **What is Multi-AZ Deployment?**
    - Deploying across multiple availability zones for high availability.

53. **What is Region?**
    - Geographic area with multiple availability zones.

54. **What is Availability Zone?**
    - Isolated data center within region.

55. **What is Reserved Instance?**
    - Pre-paid EC2 capacity for cost savings.

56. **What is Spot Instance?**
    - Discounted EC2 capacity available intermittently.

57. **What is Savings Plan?**
    - Flexible pricing for consistent compute usage.

58. **What is AWS Well-Architected Framework?**
    - Best practices for designing secure, high-performing, resilient systems.

59. **What are AWS Well-Architected Pillars?**
    - Operational Excellence, Security, Reliability, Performance Efficiency, Cost Optimization.

60. **What is AWS Total Cost of Ownership (TCO)?**
    - Calculator estimating savings migrating to AWS.

---

## AWS Services by Category

| Category | Services |
|----------|----------|
| **Compute** | EC2, Lambda, Elastic Beanstalk, ECS, EKS |
| **Storage** | S3, EBS, Glacier, EFS |
| **Database** | RDS, DynamoDB, Redshift, Neptune |
| **Networking** | VPC, CloudFront, Route53, ELB |
| **Security** | IAM, KMS, Secrets Manager, WAF |
| **DevOps** | CodePipeline, CodeBuild, CodeDeploy, CloudFormation |
| **Analytics** | Athena, Redshift, SageMaker, Kinesis |

---

## Best Practices

1. Use IAM roles, not access keys
2. Enable MFA on root account
3. Use VPC with security groups
4. Implement encryption at rest and transit
5. Use managed services when possible
6. Plan for disaster recovery
7. Monitor with CloudWatch
8. Use auto-scaling
9. Implement cost optimization
10. Follow Well-Architected Framework

---

## Common Mistakes

1. Using root account credentials
2. Over-provisioned resources
3. No backup strategy
4. Inadequate security groups
5. Missing monitoring
6. Poor IAM policies
7. No cost optimization
8. Ignoring compliance requirements
9. Single region deployment
10. Manual resource management

---

## Migration Strategies (6Rs)

1. **Rehost** - Lift and shift
2. **Replatform** - Lift, tinker, and shift
3. **Refactor** - Re-engineer to use cloud-native
4. **Repurchase** - Change license model
5. **Retire** - Decommission
6. **Retain** - Keep on-premises

---

## Summary

Master EC2, S3, RDS, Lambda, and other core AWS services. Understand deployment models, IAM, VPC, and security. Know CloudFormation for IaC, CodePipeline for CI/CD, and monitoring tools. Follow Well-Architected Framework for design best practices.

---

## References

- [AWS Official Documentation](https://docs.aws.amazon.com/)
- [AWS Well-Architected Framework](https://aws.amazon.com/architecture/well-architected/)
- [AWS Training and Certification](https://aws.amazon.com/training/)
- [AWS Solutions Architecture](https://aws.amazon.com/blogs/architecture/)
