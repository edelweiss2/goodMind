<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>chatbotTest demo</title>
    <script src="https://unpkg.com/vue"></script>
    <script src="./static/chatbotTest.umd.min.js"></script>
    <link rel="stylesheet" href="./static/chatbotTest.css">
</head>
<body>
  <div id="app"></div>
  <script type="text/javascript">
    window.onload=function () {
      const chatBot = chatbotTest.build({
        el: '#app',
        apiUrl: '/messenger-api',
        apiVersion: 'v2',
        apiToken: 'QXBNa1lOdVZTaHN3cURzd2hwcHdlTUNlb1phS1ZPekc=',
        log: true,
        callbacks: {
          success: function (res) {
            const question = res[0];
            const answer = res[1];
            console.log('test reply question : ', question);
            console.log('test reply answer : ', answer);
          },
          error: function (err) {
            console.log('test reply error response: ', err);
          }
        }
      });
      chatBot.sendParamsConfig('open');
    }
  </script>
</body>
</html>