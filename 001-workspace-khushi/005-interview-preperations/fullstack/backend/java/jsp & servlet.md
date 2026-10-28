```
**JSP and Servlet Interview Questions and Answers**

1. **What is the difference between JSP and Servlets?**
   JSP is used for creating dynamic web pages with HTML-like syntax, while Servlets are Java programs that handle HTTP requests and responses.

2. **How does JSP work internally?**
   JSP is first converted into a Servlet, compiled, and then executed.

3. **What are the different types of JSP tags?**
   JSP includes directives (`<%@ directive %>`), declarations (`<%! %>`), expressions (`<%= %>`), and scriptlets (`<% %>`).

4. **What is the JSP lifecycle?**
   The lifecycle includes translation, compilation, initialization, execution, and destruction.

5. **What are JSP implicit objects?**
   Implicit objects include request, response, session, application, out, page, pageContext, exception, and config.

6. **What is a JSP directive?**
   Directives provide global information about the JSP page, such as importing packages or setting the page encoding.

7. **What is the difference between include directive and include action in JSP?**
   The `include` directive (`<%@ include file="file.jsp" %>`) includes content at compile time, while `<jsp:include>` includes content at runtime.

8. **What are JSP actions?**
   JSP actions include `<jsp:include>`, `<jsp:forward>`, `<jsp:param>`, and `<jsp:useBean>`.

9. **How do you handle exceptions in JSP?**
   By using `<%@ page errorPage="error.jsp" %>` or try-catch blocks in scriptlets.

10. **What is the purpose of the JSP `pageContext` object?**
    It provides access to various objects like request, response, session, and application.

11. **What is the difference between forward and redirect in JSP/Servlet?**
    Forward (`RequestDispatcher.forward()`) happens on the server side, whereas redirect (`response.sendRedirect()`) makes a new client request.

12. **What is the purpose of `jspInit()` and `jspDestroy()` in JSP?**
    `jspInit()` initializes resources, while `jspDestroy()` releases them before the JSP is removed from memory.

13. **How do you use JavaBeans in JSP?**
    JavaBeans are used with `<jsp:useBean>`, `<jsp:setProperty>`, and `<jsp:getProperty>`.

14. **What is the Servlet lifecycle?**
    It includes loading, initialization (`init()`), request handling (`service()`), and destruction (`destroy()`).

15. **What is the difference between GenericServlet and HttpServlet?**
    `GenericServlet` is protocol-independent, while `HttpServlet` is specifically for handling HTTP requests.

16. **What are the different methods of `HttpServlet`?**
    Common methods include `doGet()`, `doPost()`, `doPut()`, and `doDelete()`.

17. **How do you handle sessions in Servlets?**
    Sessions can be managed using `HttpSession`, cookies, or URL rewriting.

18. **What is the purpose of ServletConfig and ServletContext?**
    `ServletConfig` is specific to a servlet, while `ServletContext` is shared across the entire web application.

19. **What is a filter in Servlets?**
    A filter intercepts requests and responses for logging, authentication, etc.

20. **How does a RequestDispatcher work?**
    It forwards a request from one servlet to another.

21. **What is the difference between `doGet()` and `doPost()`?**
    `doGet()` is used for idempotent requests, while `doPost()` is for sending sensitive data.

22. **What is Servlet Chaining?**
    Servlet Chaining is passing a request from one servlet to another before sending a response.

23. **What are cookies, and how are they used in Servlets?**
    Cookies store user data on the client-side and are sent with every request.

24. **What is URL Rewriting?**
    URL Rewriting appends session data in the URL to track users without cookies.

25. **What are the different types of session tracking mechanisms in JSP/Servlets?**
    Cookies, URL rewriting, session objects, and hidden form fields.

26. **How do you implement authentication in JSP/Servlet?**
    Using form-based authentication, filters, or Java EE security constraints.

27. **How do you prevent SQL Injection in JSP/Servlet?**
    By using prepared statements or ORM frameworks like Hibernate.

28. **What is the purpose of the `isELIgnored` attribute in JSP?**
    It disables Expression Language (EL) evaluation in JSP.

29. **What is a WAR file?**
    A WAR (Web Application Archive) file packages a web application for deployment.

30. **How do you deploy a JSP/Servlet application?**
    Deploy it as a WAR file in a servlet container like Tomcat.

31. **What is a Session Listener in Servlets?**
    It tracks session creation and destruction.

32. **What is the difference between a ServletContextListener and a HttpSessionListener?**
    `ServletContextListener` listens to application-wide events, whereas `HttpSessionListener` listens to session-level events.

33. **What is the use of annotation-based configuration in Servlets?**
    Instead of web.xml, you can use `@WebServlet`, `@WebFilter`, etc.

34. **What is the difference between synchronous and asynchronous Servlets?**
    Asynchronous Servlets process long-running tasks without blocking the main thread.

35. **How does a JSP file differ from a Servlet file?**
    JSP files are HTML-centric, while Servlets require Java coding to generate HTML.

36. **What is a custom tag in JSP?**
    Custom tags extend JSP functionality by allowing reusability of logic.

37. **How do you prevent XSS attacks in JSP/Servlet?**
    By encoding user inputs before displaying them.

38. **What are JSTL tags?**
    JSP Standard Tag Library (JSTL) provides common functions like looping and formatting.

39. **How do you include static content in JSP?**
    By using `<%@ include file="header.jsp" %>` or `<jsp:include page="footer.jsp"/>`.

40. **What is the difference between Servlet OutputStream and PrintWriter?**
    `OutputStream` is used for binary data, while `PrintWriter` is for text data.

41. **How do you create a multi-threaded Servlet?**
    By implementing `SingleThreadModel` (deprecated) or synchronizing critical sections.

42. **What is the role of `web.xml` in a JSP/Servlet application?**
    `web.xml` configures servlets, filters, and security settings.

43. **What is an annotation-based Servlet?**
    Servlets defined with `@WebServlet` instead of web.xml.

44. **How do you configure a filter in Servlets?**
    Using `@WebFilter` annotation or web.xml.

45. **What is the role of listeners in Servlets?**
    They monitor and react to application-wide events.

46. **How do you perform exception handling in Servlets?**
    By using `try-catch` or specifying `<error-page>` in web.xml.

47. **What is a multipart request in JSP/Servlet?**
    A request that contains file uploads.

48. **What is the difference between `ServletConfig` and `ServletContext` parameters?**
    `ServletConfig` is servlet-specific, while `ServletContext` applies to the whole application.

49. **How do you pass initialization parameters to a Servlet?**
    Using `<init-param>` in web.xml.

50. **What are WebSockets, and how do they relate to JSP/Servlets?**
    WebSockets enable real-time bidirectional communication between the client and server.
```
