# 🎯 REGEX ?

<img src="reg1">

* Regex (Regular Expressions), metinlerde belirli bir deseni tanımlamak için kullanılan bir yöntemdir.
* Yani, belirli bir karakter veya karakter dizisi kalıbı arayan bir arama işlemi için kullanılır.
* Regex, çoğu programlama dilinde bulunan bir kütüphanedir ve metin işleme, veri doğrulama, veri analizi, veri ayıklama
  ve metin düzenleme gibi birçok alanda kullanılabilir.
* Regex, birçok farklı karakteri, belirli karakter örüntülerini, özel karakterleri ve sınıfları içeren karmaşık
  ifadeleri kullanarak metinlerde arama yapabilir.
* Örneğin, bir e-posta adresi veya telefon numarası gibi belirli bir formatta bulunan verileri bulmak için Regex
  ifadeleri kullanılabilir.
* Regex ifadeleri, yalnızca bir metin desenini eşleştirmekle kalmaz, aynı zamanda eşleşen deseni değiştirerek metin
  düzenleme işlemlerinde de kullanılabilir.
* Örneğin, bir metindeki tüm belirli karakterleri veya kelime öbeklerini değiştirmek için Regex kullanılabilir.

# 🎯 TERİMLERİ ?

## 📌 Metin Deseni

* Regex ifadeleri, aranacak metnin desenini tanımlar. Örneğin, bir telefon numarası veya e-posta adresi gibi belirli bir
  formatta bulunan verileri bulmak için Regex ifadeleri kullanılabilir.

## 📌 Karakterler

* Regex ifadeleri, belirli bir karakteri eşleştirmek için kullanılabilir. Örneğin, "a" karakteri, metindeki tüm "a"
  karakterlerine eşleşir.
* . (Nokta): Herhangi bir karakteri eşleştirir.
* \ (Backslash): Özel karakterler için kaçış karakteri olarak kullanılır. Örneğin, "." karakterini aramak için "."
  ifadesi kullanılır.
* [] (Köşeli parantezler): Belirli karakter sınıflarını eşleştirmek için kullanılır. Örneğin, [abc] ifadesi, "a", "b"
  veya "c" karakterlerine eşleşir.
* ^ (Caret): Bir karakter veya karakter sınıfının dışındaki tüm karakterleri eşleştirir. Örneğin, "[^abc]" ifadesi, "a"
  , "b" veya "c" karakterleri dışındaki tüm karakterlere eşleşir.
* $ (Dolar işareti): Metnin sonunu eşleştirir.
* () (Parantezler): Özel grupları tanımlamak için kullanılır. Bu, daha sonra bu gruplara erişmek için kullanılabilir.
  Örneğin, "([a-z])+" ifadesi, bir veya daha fazla küçük harfli kelime öbeğine eşleşir.
* (Asterisk): Sıfır veya daha fazla kez tekrarlanan karakterleri eşleştirir.
* (Plus): Bir veya daha fazla kez tekrarlanan karakterleri eşleştirir.
* (Question Mark): Sıfır veya bir kez tekrarlanan karakterleri eşleştirir.

## 📌 Metakarakterler

* Metakarakterler, Regex ifadelerinde özel bir anlama sahip olan karakterlerdir. Örneğin, "^" ifadesi metnin
  başlangıcını, "$" ifadesi metnin sonunu, "." ifadesi herhangi bir karakteri eşleştirir.

## 📌 Sınıflar

* Regex ifadeleri, belirli bir karakter sınıfını eşleştirmek için kullanılabilir. Örneğin, "[abc]" ifadesi, "a", "b"
  veya "c" karakterlerine eşleşir.
* [a-z]: Küçük harfli herhangi bir karakteri eşleştirir.
* [A-Z]: Büyük harfli herhangi bir karakteri eşleştirir.
* [0-9]: Herhangi bir sayısal karakteri eşleştirir.
* [\s]: Boşluk karakterlerini eşleştirir. Bu, normal boşluk karakteri yanı sıra sekme ve satır atlamalarını da içerir.
* [\S]: Boşluk karakterleri olmayan karakterleri eşleştirir.
* [\d]: Sayısal karakterleri eşleştirir. [0-9] ile aynı anlama gelir.
* [\D]: Sayısal olmayan karakterleri eşleştirir. [^0-9] ile aynı anlama gelir.
* Sınıflar, Regex ifadelerinin daha spesifik ve esnek olmasını sağlar. Sınıflar, bir metinde belirli bir karakter
  sınıfını aramak veya bu karakter sınıfının dışındaki tüm karakterleri eşleştirmek gibi özelleştirilmiş aramalar
  gerçekleştirmek için kullanılabilir. Sınıflar, Regex ifadelerinin daha karmaşık ve esnek kalıplar oluşturmasına da
  yardımcı olur.

## 📌 Özel Sınıflar

* Özel sınıflar, belirli bir karakter özelliğine göre eşleşme sağlamak için kullanılır. Örneğin, "\d" ifadesi, bir
  sayıya eşleşir.
* \d: Sayısal karakterleri eşleştirir. [0-9] ile aynı anlama gelir.
* \D: Sayısal olmayan karakterleri eşleştirir. [^0-9] ile aynı anlama gelir.
* \w: Kelime karakterlerini (harf, rakam ve alt çizgi) eşleştirir. [a-zA-Z0-9_] ile aynı anlama gelir.
* \W: Kelime karakterleri olmayan karakterleri eşleştirir. [^a-zA-Z0-9_] ile aynı anlama gelir.
* \s: Boşluk karakterlerini eşleştirir. Bu, normal boşluk karakteri yanı sıra sekme ve satır atlamalarını da içerir.
* \S: Boşluk karakterleri olmayan karakterleri eşleştirir.
* \b: Kelime sınırını belirler. Örneğin, "\btest\b" ifadesi, sadece "test" kelimesine eşleşir ve "testosterone" gibi
  kelime parçalarına eşleşmez.
* \B: Kelime sınırı olmayan karakterleri eşleştirir.
* Bu özel sınıflar, Regex ifadelerinin daha spesifik ve doğru olmasını sağlar. Örneğin, bir metindeki tüm sayıları
  bulmak için "\d+" ifadesi kullanılabilir veya yalnızca harf ve rakam karakterlerini eşleştirmek için "\w+" ifadesi
  kullanılabilir.

## 📌 Quantifiers

* Quantifiers, Regex ifadelerindeki öğelerin tekrar sayısını belirtmek için kullanılır. Örneğin, "+" ifadesi, bir
  karakter veya karakter sınıfının bir veya daha fazla tekrarını eşleştirir.
* (Plus): Bir veya daha fazla kez tekrarlanan öğeleri eşleştirir. Örneğin, "a+" ifadesi, "a" karakterinin bir veya daha
  fazla tekrarını eşleştirir.
* (Asterisk): Sıfır veya daha fazla kez tekrarlanan öğeleri eşleştirir. Örneğin, "a*" ifadesi, "a" karakterinin sıfır
  veya daha fazla tekrarını eşleştirir.
* ? (Question Mark): Sıfır veya bir kez tekrarlanan öğeleri eşleştirir. Örneğin, "colou?r" ifadesi, "color" veya "
  colour" kelimesine eşleşir.
* {n} (Fixed Quantifier): Belirli bir sayıda tekrarlanan öğeleri eşleştirir. Örneğin, "a{3}" ifadesi, üç "a" karakterine
  eşleşir.
* {n,} (Minimum Quantifier): Belirli bir sayıda veya daha fazla kez tekrarlanan öğeleri eşleştirir. Örneğin, "a{3,}"
  ifadesi, en az üç "a" karakterine eşleşir.
* {n,m} (Range Quantifier): Belirli bir aralıkta tekrarlanan öğeleri eşleştirir. Örneğin, "a{2,4}" ifadesi, en az iki,
  en fazla dört "a" karakterine eşleşir.
* Quantifiers, Regex ifadelerinin daha spesifik ve esnek olmasını sağlar. Quantifiers'ları kullanarak, bir metindeki
  belirli bir deseni belirli bir sayıda veya aralıkta tekrarlanan öğeleri aramak gibi daha özelleştirilmiş aramalar
  gerçekleştirebilirsiniz.

## 📌 Gruplar

* Gruplar, Regex ifadelerinde bir aralığı belirtmek ve bu aralığa göre eşleşmeyi sağlamak için kullanılır. Örneğin, "(
  abc){2,3}" ifadesi, "abc" öbeğinin 2 ila 3 kez tekrarlanmasına eşleşir.
* (ab): "ab" kalıbını eşleştirir. Bu gruba daha sonra erişmek için "\1" kullanılabilir.
* (a|b): "a" veya "b" karakterlerini eşleştirir.
* (?:ab): "ab" kalıbını eşleştirir, ancak bu gruba daha sonra erişilemez.
* (a*)(b*): "a" ve "b" karakterlerini sıfır veya daha fazla kez tekrarlayarak eşleştirir.
* (a+)(b+): "a" ve "b" karakterlerini bir veya daha fazla kez tekrarlayarak eşleştirir.
* (a{3})(b{2}): Üç "a" ve iki "b" karakterini eşleştirir.
* ([a-z]): Küçük harfli herhangi bir karakteri eşleştirir. Bu gruba daha sonra erişmek için "\1" kullanılabilir.
* Gruplar, Regex ifadelerinin daha spesifik ve esnek olmasını sağlar. Gruplar, bir metindeki belirli bir desene erişmek
  veya bir deseni belirli bir şekilde değiştirmek gibi özelleştirilmiş aramalar gerçekleştirmek için kullanılabilir.
  Gruplar, Regex ifadelerinin karmaşık kalıplarını daha da geliştirmek için de kullanılabilir.

## 📌 Lookahead ve Lookbehind

* Lookahead ve lookbehind ifadeleri, Regex ifadelerinde bir sonraki veya önceki desene göre eşleşmeyi belirlemek için
  kullanılır. Lookahead ifadesi "(?=...)" olarak ifade edilirken, lookbehind ifadesi "(?<=...)" olarak ifade edilir.
* Lookahead: "?=" ifadesi ile başlayan bir ifade lookahead ifadesidir. Bu ifade, bir öğenin belirli bir öğeden sonra
  gelip gelmediğini kontrol eder. Örneğin, "a(?=b)" ifadesi, "a" karakterinin sadece "b" karakterinden önce olduğu
  yerleri eşleştirir.
* Negative Lookahead: "?!" ifadesi ile başlayan bir ifade negative lookahead ifadesidir. Bu ifade, bir öğenin belirli
  bir öğeden sonra gelmediğini kontrol eder. Örneğin, "a(?!b)" ifadesi, "a" karakterinin "b" karakterinden önce olmadığı
  yerleri eşleştirir.
* Lookbehind: "?<=" ifadesi ile başlayan bir ifade lookbehind ifadesidir. Bu ifade, bir öğenin belirli bir öğeden önce
  gelip gelmediğini kontrol eder. Örneğin, "(?<=a)b" ifadesi, "b" karakterinin sadece "a" karakterinden önce olduğu
  yerleri eşleştirir.
* Negative Lookbehind: "?<! " ifadesi ile başlayan bir ifade negative lookbehind ifadesidir. Bu ifade, bir öğenin
  belirli bir öğeden önce gelmediğini kontrol eder. Örneğin, "(?<!a)b" ifadesi, "b" karakterinin "a" karakterinden önce
  olmadığı yerleri eşleştirir.
* Lookahead ve lookbehind ifadeleri, özellikle Regex ifadelerinin daha karmaşık kalıplarının oluşturulması için
  kullanılır. Lookahead ifadeleri, belirli koşulların sağlandığı yerleri eşleştirmek için kullanılırken, lookbehind
  ifadeleri, öncesinde belirli bir koşulu sağlayan yerleri eşleştirmek için kullanılır. Negative lookahead ve negative
  lookbehind ifadeleri, belirli bir koşulu sağlamayan yerleri eşleştirmek için kullanılır.

## 📌 Alternation

* Alternation, "|" işareti ile belirtilen birden fazla desene eşleşmeyi sağlamak için kullanılır. Örneğin, "cat|dog"
  ifadesi, metindeki "cat" veya "dog" kelimesine eşleşir.

# 🎯 REGEX SERVICE ?

```java
public class RegexUtils {
    public String usernameRegex(String username) {
        String regex = "^(?=.{8,20}$)(?![_.])(?!.*[_.]{2})[a-zA-Z0-9._]+(?<![_.])$";
    }
}
```

* ^: Satırın başlangıcını belirtir.
* (?=.{8,20}$): Lookahead ifadesidir ve metnin 8 ile 20 karakter arasında olup olmadığını kontrol eder.
* (?![_.]): Negative lookahead ifadesidir ve metnin "_" veya "." karakterleriyle başlamadığını kontrol eder.
* (?!.*[_.]{2}): Negative lookahead ifadesidir ve metnin ardışık iki "_" veya "." karakterlerine sahip olmadığını
  kontrol eder.
* [a-zA-Z0-9._]+: Metnin geri kalanını eşleştirmek için karakter sınıfıdır. Burada büyük harf, küçük harf, rakam ve "."
  veya "_" karakterleri eşleştirilir.
* (?<![_.]): Negative lookbehind ifadesidir ve metnin "." veya "_" karakterleriyle bitmediğini kontrol eder.
* $: Satırın sonunu belirtir.

```java
public class RegexUtils {
    public String passwordRegex(String password) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
    }
}
```

* ^ : Satırın başlangıcını belirtir.
* (?=.*[a-z]) : Lookahead ifadesidir ve metnin en az bir küçük harf içerip içermediğini kontrol eder.
* (?=.*[A-Z]) : Lookahead ifadesidir ve metnin en az bir büyük harf içerip içermediğini kontrol eder.
* (?=.*\d) : Lookahead ifadesidir ve metnin en az bir sayısal karakter içerip içermediğini kontrol eder.
* (?=.*[@$!%*?&]) : Lookahead ifadesidir ve metnin en az bir özel karakter içerip içermediğini kontrol eder.
* [A-Za-z\\d@$!%*?&]{8,} [A-Za-z\d@$!%*?&]{8,} : Karakter sınıfıdır ve metnin geri kalanını eşleştirmek için kullanılır.
  Bu karakter sınıfı büyük harf, küçük harf, rakam ve özel karakterleri içerir ve metnin en az 8 karakter uzunluğunda
  olmasını belirtir.
* $: Satırın sonunu belirtir.

```java
public class RegexUtils {
    public String emailRegex(String email) {
        String regex = "^(?<!\\?)[a-zA-Z0-9]+[._a-zA-Z0-9]*[a-zA-Z]*@[a-zA-Z0-9]{2,}.[a-zA-Z.]{2,3}[?<!\\com]$";
    }
}
```

* ^: Satırın başlangıcını belirtir.
* (?<!\\?) : Negative lookbehind ifadesidir ve metnin "?" karakterinden önce gelmediğini kontrol eder.
* [a-zA-Z0-9]+ : Karakter sınıfıdır ve metnin başlangıcındaki karakterleri eşleştirmek için kullanılır. Bu karakter
  sınıfı büyük harf, küçük harf ve rakamları içerir.
* [._a-zA-Z0-9]* : Karakter sınıfıdır ve metnin geri kalanını eşleştirmek için kullanılır. Bu karakter sınıfı, ".", ""
  veya harf ve rakamları içerir.
* [a-zA-Z]* : Karakter sınıfıdır ve metnin sonundaki harfleri eşleştirmek için kullanılır.
* @ : "@" karakterini eşleştirir.
* [a-zA-Z0-9]{2,} : Karakter sınıfıdır ve "@" karakterinden sonraki alanı eşleştirmek için kullanılır. Bu karakter
  sınıfı, büyük harf, küçük harf ve rakamları içerir ve en az 2 karakter uzunluğunda olmalıdır.
* [a-zA-Z.]{2,3} : Karakter sınıfıdır ve "@" karakterinden sonraki alanın sonundaki karakterleri eşleştirmek için
  kullanılır. Bu karakter sınıfı büyük harf, küçük harf ve "." karakterlerini içerir ve en az 2 en fazla 3 karakter
  uzunluğunda olmalıdır.
* [?<!\\com] : Negative lookbehind ifadesidir ve metnin "com" kelimesinin "?" karakterinden önce olmadığını kontrol
  eder.
* $: Satırın sonunu belirtir.

## 📌 Docker Compose

```yaml
version: '3.8'
services:

  springboot-regex:
    image: rasitesdmr1486/springboot-regex:v1.0
    container_name: springboot-regex
    restart: always
    ports:
      - "8080:8080"
    networks:
      - my-network

networks:
  my-network:
    driver: bridge
```

## 📌 docker-compose.yaml

```yaml
docker-compose up -d
```

```yaml
docker-compose down -v
```

## 📌 Docker Containers

<img src="">

▶️ swagger path : http://localhost:8080/swagger-ui.html