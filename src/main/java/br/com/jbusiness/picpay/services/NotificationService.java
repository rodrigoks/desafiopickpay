package br.com.jbusiness.picpay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.jbusiness.picpay.domain.user.User;
import br.com.jbusiness.picpay.dto.NotificationDTO;

@Service
public class NotificationService {

    @Autowired
    private RestTemplate restTemplate;

    public void sendNotification(User user, String message) throws Exception {
        String email = user.getEmail();
        NotificationDTO notification = new NotificationDTO(email, message);
       
        // ResponseEntity<String> notificationResponse = restTemplate.postForEntity("https://util.devi.tools/api/v1/notify", notification, String.class);

        // if(notificationResponse.getStatusCode() != HttpStatus.OK){
        //     System.out.println("Error sending notification.");
        //     throw new Exception("Notification service down.");
        // }

        System.out.println("Error sending notification. Service down.");

    }

}
