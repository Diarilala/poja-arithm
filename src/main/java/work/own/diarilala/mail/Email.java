package work.own.diarilala.mail;

import jakarta.mail.internet.InternetAddress;
import java.io.File;
import java.util.List;
import work.own.diarilala.PojaGenerated;

@PojaGenerated
public record Email(
    InternetAddress to,
    List<InternetAddress> cc,
    List<InternetAddress> bcc,
    String subject,
    String htmlBody,
    List<File> attachments) {}
