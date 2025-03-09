# HerokuApp Test Automation

Bu proje, [HerokuApp](https://the-internet.herokuapp.com/) üzerindeki test senaryolarını otomatikleştirmek için oluşturulmuştur. **Java, Selenium, TestNG ve Maven** kullanılarak geliştirilmiştir.

## 📌 Teknolojiler
- **Java** (Test senaryoları için)
- **Selenium WebDriver** (Tarayıcı otomasyonu için)
- **TestNG** (Test yönetimi için)
- **Maven** (Bağımlılık yönetimi için)

## 🚀 Kurulum ve Çalıştırma
1. **Projeyi klonlayın:**
   ```bash
   git clone https://github.com/yigitcomez/HerokuApp-TestAutomation.git
   cd HerokuApp-TestAutomation
   ```
2. **Bağımlılıkları yükleyin:**
   ```bash
   mvn clean install
   ```
3. **Testleri çalıştırın:**
   ```bash
   mvn test
   ```

## 📄 Test Senaryoları
- **Login Test**: Geçerli ve geçersiz kullanıcı giriş testleri
- **Checkbox Test**: Checkbox'ların doğru çalıştığını kontrol etme
- **Alert Test**: JavaScript uyarı pencereleri testi
- **File Upload Test**: Dosya yükleme fonksiyonunu doğrulama

## 📄 Lisans
Bu proje **MIT Lisansı** altında lisanslanmıştır.

