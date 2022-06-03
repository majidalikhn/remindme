<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Remind Me About Following</title>
</head>
<body>
<h1>Add your reminder here</h1>
    <form action="/remindme" method="post">
        <div>Subject:</div>
        <input type="text" name="subject"/>
        <br/><br/>
        <div>Receiver:</div>
        <input type="email" name="recipient"/>
        <br/><br/>
        <div>Message:</div>
        <textarea rows="2" name="messageBody"></textarea>
        <br/><br/>
        <div>Remind Date:</div>
        <input type="date" name="emailSendingDate"/>
        <br/><br/>
        <input type="submit" value="Add reminder"/>
    </form>
</body>
</html>
