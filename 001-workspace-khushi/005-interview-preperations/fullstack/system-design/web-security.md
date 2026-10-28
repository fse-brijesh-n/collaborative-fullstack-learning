# Web Security Interview Q&A

## Overview
Web Security covers common vulnerabilities (OWASP Top 10), authentication, authorization, encryption, and best practices for building secure web applications.

---

## Interview Questions & Answers

1. **What is Web Security?**
   - Web Security is protecting web applications and data from attacks, vulnerabilities, and unauthorized access.

2. **What is OWASP?**
   - OWASP (Open Web Application Security Project) identifies and documents common web vulnerabilities.

3. **What is OWASP Top 10?**
   - List of 10 most critical web security risks: Injection, Broken Authentication, Sensitive Data Exposure, XML External Entities, Broken Access Control, etc.

4. **What is SQL Injection?**
   - Inserting malicious SQL into input fields to manipulate database queries.

5. **How do you prevent SQL Injection?**
   - Use prepared statements, parameterized queries, input validation, ORM frameworks.

6. **What is Cross-Site Scripting (XSS)?**
   - Injecting malicious scripts into web pages executed in user browser.

7. **What are types of XSS?**
   - Stored XSS (malicious data in database), Reflected XSS (immediate reflection), DOM-based XSS (JavaScript manipulation).

8. **How do you prevent XSS?**
   - Input validation, output encoding, Content Security Policy, HTML escaping.

9. **What is Content Security Policy (CSP)?**
   - HTTP header restricting sources for scripts, styles, images preventing XSS.

10. **What is Cross-Site Request Forgery (CSRF)?**
    - Attacker tricks user into performing unwanted actions on authenticated site.

11. **How do you prevent CSRF?**
    - CSRF tokens, SameSite cookies, double-submit cookies, referer validation.

12. **What is CSRF Token?**
    - Unique token sent with requests, verified server-side to authenticate requests from legitimate source.

13. **What is SameSite Cookie?**
    - Cookie attribute restricting when browsers send cookies in cross-site requests.

14. **What are SameSite Values?**
    - Strict (never cross-site), Lax (GET only), None (always with Secure).

15. **What is Sensitive Data Exposure?**
    - Exposing confidential information like passwords, credit cards, PII.

16. **How do you prevent Sensitive Data Exposure?**
    - Use HTTPS, encrypt data at rest, mask sensitive data, proper access controls.

17. **What is HTTPS?**
    - HTTP Secure - encrypted communication using SSL/TLS protocol.

18. **What is SSL/TLS?**
    - Secure Sockets Layer / Transport Layer Security protocols for encrypted communication.

19. **What is Certificate?**
    - Digital credential verifying website's identity and enabling encrypted connection.

20. **What is Self-Signed Certificate?**
    - Certificate not issued by trusted CA, used in development/testing.

21. **What is Broken Authentication?**
    - Weak password policies, session mismanagement, credential exposure.

22. **How do you prevent Broken Authentication?**
    - Strong passwords, MFA, secure session management, rate limiting login attempts.

23. **What is Multi-Factor Authentication (MFA)?**
    - Requiring multiple verification methods (password + OTP, password + biometric).

24. **What is Password Hashing?**
    - Converting passwords to irreversible hash for secure storage.

25. **What are secure password hashing algorithms?**
    - bcrypt, scrypt, Argon2, PBKDF2 (password-based).

26. **What is Salting?**
    - Adding random data to password before hashing to prevent rainbow tables.

27. **What is Pepper?**
    - Secret value added to password before hashing, kept server-side.

28. **What is the difference between Salt and Pepper?**
    - Salt is unique per password, stored with hash; Pepper is global secret.

29. **What is Broken Access Control?**
    - Users accessing unauthorized resources or performing unauthorized actions.

30. **How do you prevent Broken Access Control?**
    - Role-based access control, principle of least privilege, access control enforcement.

31. **What is Role-Based Access Control (RBAC)?**
    - Users assigned roles with associated permissions.

32. **What is Attribute-Based Access Control (ABAC)?**
    - Access decisions based on attributes of user, resource, and environment.

33. **What is Principle of Least Privilege?**
    - Users granted minimum permissions necessary for their role.

34. **What is Security Misconfiguration?**
    - Insecure default settings, incomplete setup, unnecessary services.

35. **How do you prevent Security Misconfiguration?**
    - Harden configurations, remove unnecessary services, security testing.

36. **What is XML External Entity (XXE)?**
    - Exploit using XML entity references to access system files or perform DoS.

37. **How do you prevent XXE?**
    - Disable external entity processing, use JSON instead of XML, validate input.

38. **What is Deserialization Attack?**
    - Exploit through untrusted serialized object deserialization.

39. **How do you prevent Deserialization?**
    - Avoid deserializing untrusted data, use safe serialization, implement whitelisting.

40. **What is Directory Traversal?**
    - Accessing files outside intended directory using path traversal sequences.

41. **How do you prevent Directory Traversal?**
    - Input validation, path canonicalization, access control checks.

42. **What is Command Injection?**
    - Executing arbitrary system commands through application input.

43. **How do you prevent Command Injection?**
    - Input validation, avoid system commands, use APIs instead.

44. **What is Authentication?**
    - Verifying user identity through credentials.

45. **What is Authorization?**
    - Determining what authenticated user can access.

46. **What is the difference between Authentication and Authorization?**
    - Authentication verifies who you are; Authorization determines what you can do.

47. **What is Session Hijacking?**
    - Attacker stealing session cookie/token accessing user's session.

48. **How do you prevent Session Hijacking?**
    - Use HTTPS, secure cookies, short session timeouts, regenerate session ID on login.

49. **What is Secure Cookie?**
    - Cookie with Secure flag transmitted only over HTTPS.

50. **What is HttpOnly Cookie?**
    - Cookie inaccessible to JavaScript, preventing XSS-based theft.

51. **What is Rate Limiting?**
    - Restricting requests to prevent brute force and DoS attacks.

52. **What is Brute Force Attack?**
    - Trying many password combinations to gain unauthorized access.

53. **How do you prevent Brute Force?**
    - Rate limiting, account lockout, CAPTCHA, strong passwords.

54. **What is CAPTCHA?**
    - Challenge-response test verifying human interaction.

55. **What is Denial of Service (DoS)?**
    - Overwhelming system with requests making it unavailable.

56. **What is Distributed Denial of Service (DDoS)?**
    - DoS attack from multiple sources/machines.

57. **How do you prevent DDoS?**
    - Rate limiting, WAF (Web Application Firewall), traffic filtering.

58. **What is Web Application Firewall (WAF)?**
    - Filters suspicious traffic based on rules protecting web applications.

59. **What is Security Audit?**
    - Assessment of security controls and vulnerabilities.

60. **What is Penetration Testing?**
    - Authorized security testing simulating attacks to find vulnerabilities.

---

## OWASP Top 10 (2021)

1. Broken Access Control
2. Cryptographic Failures
3. Injection
4. Insecure Design
5. Security Misconfiguration
6. Vulnerable and Outdated Components
7. Authentication Failures
8. Software and Data Integrity Failures
9. Logging and Monitoring Failures
10. Server-Side Request Forgery (SSRF)

---

## Security Best Practices

1. Use HTTPS everywhere
2. Implement MFA for accounts
3. Hash passwords with modern algorithms
4. Validate and sanitize all input
5. Implement access control properly
6. Keep dependencies updated
7. Use security headers (CSP, HSTS, X-Frame-Options)
8. Log security events
9. Monitor for suspicious activity
10. Conduct regular security audits

---

## HTTP Security Headers

| Header | Purpose |
|--------|---------|
| `Strict-Transport-Security` | Enforce HTTPS |
| `Content-Security-Policy` | Restrict content sources |
| `X-Frame-Options` | Prevent clickjacking |
| `X-Content-Type-Options` | Prevent MIME sniffing |
| `Referrer-Policy` | Control referrer info |
| `Permissions-Policy` | Control browser features |

---

## Common Mistakes

1. Storing passwords in plain text
2. Exposing sensitive data
3. Weak authentication
4. Missing input validation
5. No authorization checks
6. Using HTTP instead of HTTPS
7. Trusting user input
8. Poor error handling revealing info
9. Not updating dependencies
10. Inadequate logging

---

## Summary

Master OWASP Top 10 vulnerabilities and prevention techniques. Implement proper authentication (MFA, strong passwords), authorization (RBAC), and encryption (HTTPS, TLS). Use security headers, validate input, and maintain security awareness. Conduct regular audits and penetration testing.

---

## References

- [OWASP Top 10](https://owasp.org/www-project-top-ten/)
- [OWASP Cheat Sheets](https://cheatsheetseries.owasp.org/)
- [OWASP Testing Guide](https://owasp.org/www-project-web-security-testing-guide/)
- [Mozilla Web Security](https://infosec.mozilla.org/)
