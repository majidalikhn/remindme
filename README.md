[![LinkedIn][linkedin-shield]][linkedin-url]

<br />
<div align="center">
<h3 align="center">Remindme</h3>

  <p align="center">
    An email sending hello world written in Spring Boot
  </p>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
  </ol>
</details>

## About The Project

Nowadays sending email is a daily routine and almost everyone uses it. This application is an example which shows
how can we utilize the power of Spring Boot to send emails. This project was created and made public so that developers
exploring the idea to send an email using Spring Boot can get a template and starting working 
on it instead of starting from the beginning.

### Built With
* [Spring Boot](https://spring.io/projects/spring-boot)


<p align="right">(<a href="#top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started

To get started with the project there are few necessary things and configurations we will be discussing them below;

### Optionals
* 2-factor authentication for gmail account to make it secure. [Optional]
* Application specific gmail password, if above is followed [read here](https://support.google.com/accounts/answer/185833?hl=en) [Optional]

### Installation

1. Update application.properties with your email credentials.
Skip following if no application password was generated
2. Update your password with application specific password, so that real email password is secure and not exposed
<p align="right">(<a href="#top">back to top</a>)</p>

<!-- USAGE EXAMPLES -->
## Usage

Once application properties are set and application is up and running, go to [root](http://localhost:8080/)
and do a request with email details such as following:
```
{
  "recipient":"example@email.com",
  "emailBody":"email content",
  "subject":"email subject"
}
```
You can use postman or related tools for that. Once the request is done, an email will be sent. Take a look at `EmailController` for more details;



<p align="right">(<a href="#top">back to top</a>)</p>


<!-- CONTACT -->
## Contact

Majid Ali Khan - majidalikhn@gmail.com

Project Link: [remindme](https://github.com/majidalikhn/remindme)

<p align="right">(<a href="#top">back to top</a>)</p>

[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/majidalikhn/
