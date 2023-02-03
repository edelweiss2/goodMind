package com.example.demo.chatBot;

/*import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.Timestamp;

import java.util.Date;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.tomcat.util.codec.binary.Base64;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chatbot")
public class ChatbotController {

	@Value("${naver.chatApiUrl}") private String apiURL;
	@Value("${naver.chatSecretKey}") private String secretKey;
	
	@GetMapping("/gibuni")
	public String chatForm() {
		return "chatbot/chatForm";
	}
	
	@PostMapping("/gibuni")
	public static String main(String voiceMessage, String apiURL, String secretKey) {
		String chatbotMessage = "";
		try {
			URL url = new URL(apiURL);
			String message = getReqMessage(voiceMessage);
			System.out.println("##" + message);

			String encodeBase64String = makeSignature(message, secretKey);
			
			//api서버 접속 (서버 -> 서버 통신)
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "application/json;UTF-8");
			con.setRequestProperty("X-NCP-CHATBOT_SIGNATURE", encodeBase64String);

			// post request
			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.write(message.getBytes("UTF-8"));
			wr.flush();
			wr.close();
			int responseCode = con.getResponseCode();

			BufferedReader br;

			if (responseCode == 200) { // 정상 호출 시
				//체크용
				System.out.println(con.getResponseMessage());
				

				BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
				String decodedString;
				while ((decodedString = in.readLine()) != null) {
					chatbotMessage = decodedString;
				}
				// chatbotMessage = decodedString;
				in.close();

			} else { // Error occurred
				chatbotMessage = con.getResponseMessage();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return chatbotMessage;
	}
	
	//보낼 메세지를 네이버에서 제공해준 암호화로 변경해주는 메소드
	public static String makeSignature(String message, String secretKey) {

		String encodeBase64String = "";

		try {
			byte[] secrete_key_bytes = secretKey.getBytes("UTF-8");

			SecretKeySpec signingKey = new SecretKeySpec(secrete_key_bytes, "HmacSHA256");
			Mac mac = Mac.getInstance("HmacSHA256");
			mac.init(signingKey);

			byte[] rawHmac = mac.doFinal(message.getBytes("UTF-8"));
            encodeBase64String = Base64.encodeBase64String(rawHmac);

            return encodeBase64String;

		} catch (Exception e) {
			System.out.println(e);
		}

		return encodeBase64String;

	}
	
	//보낼 메세지를 네이버 챗봇에 포맷으로 변경해주는 메소드
	public static String getReqMessage(String voiceMessage) {

		String requestBody = "";

		try {

			JSONObject obj = new JSONObject();

			long timestamp = new Date().getTime();

			System.out.println("##" + timestamp);

			obj.put("version", "v2");
			obj.put("userId", "U47b00b58c90f8e47428af8b7bddc1231heo2");
			//=> userId is a unique code for each chat user, not a fixed value, recommend use UUID. 
			//use different id for each user could help you to split chat history for users.

			obj.put("timestamp", timestamp);

			JSONObject bubbles_obj = new JSONObject();

			bubbles_obj.put("type", "text");

			JSONObject data_obj = new JSONObject();
			data_obj.put("description", voiceMessage);

			bubbles_obj.put("type", "text");
			bubbles_obj.put("data", data_obj);

			JSONArray bubbles_array = new JSONArray();
			bubbles_array.put(bubbles_obj);

			obj.put("bubbles", bubbles_array);
			obj.put("event", "send");

			requestBody = obj.toString();

		} catch (Exception e) {
			System.out.println("## Exception : " + e);
		}

		return requestBody;

	}
}
*/