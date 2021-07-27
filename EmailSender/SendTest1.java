public class SendTest1 {
    public static void main(String[] args) {
        
        EmailSender sender = EmailSender.builder()
        .setHost("smtp.gmail.com")
        .setEmail("jun.gesteland@gmail.com")
        .setPassword("Br@vur@YouthOrchestr@")
        .build();

        sender.send("jun.gesteland@gmail.com", "hi", "email from Java code");
    }
}