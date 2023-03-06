package com.example.springbootregex.utils;

import com.example.springbootregex.exception.InvalidEmailException;
import com.example.springbootregex.exception.InvalidPasswordException;
import com.example.springbootregex.exception.InvalidUserNameException;
import lombok.AllArgsConstructor;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@UtilityClass
@Slf4j
public class RegexUtils {

    public String usernameRegex(String username) {
        String regex = "^(?=.{8,20}$)(?![_.])(?!.*[_.]{2})[a-zA-Z0-9._]+(?<![_.])$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);
        if (matcher.find()) {
            return username;
        } else {
            log.error("""
                    GEÇERSİZ USERNAME !!! \s
                    Lütfen şu bilgileri göz önüne alarak giriniz :\s
                        Kullanıcı adı 8 ile 20 karakter arasında olmalıdır.\s
                        Kullanıcı adının başına _ ve . gelmemelidir.\s
                        Art arda _ _ ve .. kullanmayınız.\s
                        Kullanıcı adının sonuna _ ve . işaretleri gelmemelidir.\s
                        Türkçe karakter kullanmayınız...
                    """);
            throw new InvalidUserNameException("""
                    GEÇERSİZ USERNAME !!! \s
                    Lütfen şu bilgileri göz önüne alarak giriniz :\s
                        Kullanıcı adı 8 ile 20 karakter arasında olmalıdır.\s
                        Kullanıcı adının başına _ ve . gelmemelidir.\s
                        Art arda _ _ ve .. kullanmayınız.\s
                        Kullanıcı adının sonuna _ ve . işaretleri gelmemelidir.\s
                        Türkçe karakter kullanmayınız...
                    """);
        }

    }

    public String passwordRegex(String password) {

        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (matcher.find()) {
            return password;
        } else {
            log.error("""
                    GEÇERSİZ PASSWORD !!! \s
                    Lütfen şu bilgileri göz önüne alarak giriniz :\s
                        En az bir küçük harf içermelidir.\s
                        En az bir büyük harf içermelidir.\s
                        En az bir sayı içermelidir.\s
                        En az bir özel karakter içermelidir [@$!%?&] \s
                        En az sekiz karakter olmalıdır...
                    """);
            throw new InvalidPasswordException("""
                    GEÇERSİZ PASSWORD !!! \s
                    Lütfen şu bilgileri göz önüne alarak giriniz :\s
                        En az bir küçük harf içermelidir.\s
                        En az bir büyük harf içermelidir.\s
                        En az bir sayı içermelidir.\s
                        En az bir özel karakter içermelidir [@$!%?&] \s
                        En az sekiz karakter olmalıdır...
                    """);
        }

    }

    public String emailRegex(String email) {
        String regex = "^(?<!\\?)[a-zA-Z0-9]+[._a-zA-Z0-9]*[a-zA-Z]*@[a-zA-Z0-9]{2,}.[a-zA-Z.]{2,3}[?<!\\com]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.find()) {
            return email;
        } else {
            log.error("""
                    GEÇERSİZ EMAİL !!! \s
                    Lütfen şu bilgileri göz önüne alarak giriniz :\s
                        _ ve . kullanılabilir.\s
                        Onun dışında özel karakter kullanmayın.\s
                    """);
            throw new InvalidEmailException("""
                    GEÇERSİZ EMAİL !!! \s
                    Lütfen şu bilgileri göz önüne alarak giriniz :\s
                        _ ve . kullanılabilir.\s
                        Onun dışında özel karakter kullanmayın.\s
                    """);
        }
    }
}
