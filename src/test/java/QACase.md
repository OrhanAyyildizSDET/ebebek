https://github.com/movilidadagil/PatikaAutomationCombo
1. Selenium Framework Part
2. ConfigReader is used to retrieve configuration from config.properties
2. DriverSetup is used to create webdriver instance according to config.properties
3. EnvConfiguration is model for config.properties so we are mapping configs to object.
3. Helper is used for webelement utilities such as visibility, clickable
4. Hooks is used for cucumber feature steps to run webdriver before steps.
2. Selenium Test Scenarios Part
   # Resources
Apps folder is including apks which are used in mobile app testing

Capabilities folder is including mobile device properties

Features folder is including cucumber scenarios which need to be re-written according to BDD
# test
Api folder is used for rest and http unit tests.

Devices is used for mapping appium device props to java object.

Karate folder is used karate testing, karate runs by using runner class but implementation is done in .feature.

Mobile pages folder is used mobile app testing and includes page objects which are including elements and locators

Model folder is used for api testing and mapping to object from json response

Pages folder is including web page objects so elements and locators

Performance folder is including gatling and jmeter folders. Jmeter is implemented by using java.

Test Scenarios folder is used for tests. Junit5 and testing are used for testing schema.

Selenium Webdriver ile aşağıdaki maddelerin gerçekleştirilmesi gerekmektedir.

https://www.e-bebek.com/ sitesi açılır.
Arama çubuğuna "kaşık maması" yazılır ve arama sonucunda gelen sonuçlardan en son ürün açılır, açılan ürünle arama sonucunda tıklanan ürünün aynı olduğu doğrulanır.

Ürün sepete eklenir.

Sağdan açılan modadan sepeti gör butonuna tıklanır.

Alışverişi tamamla butonuna tıklanır.

Üye girişi ekranının açıldığı doğrulanır.

Proje Java programlama dilinde yazılmalıdır. Maven repo kullanılmalıdır.

● Kodlar gthub üzernden paylaşılması gereklidir.

● Yazılacak senaryo için Selenum ve JUnit/Testng kullanılmalıdır.

● Assertions kullanarak senaryonun doğru çalışırlığı kontrol edilmelidir.

● Log kullanılmalıdır.

● Page object model uygulanmalıdır.

● OOP prensplerne uygun gelişitrilmelidir