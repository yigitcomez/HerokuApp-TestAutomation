# HerokuApp Test Automation

Bu proje, [HerokuApp](https://the-internet.herokuapp.com/) üzerindeki test senaryolarını otomatikleştirmek için oluşturulmuştur. **Java, Selenium, TestNG ve Maven** kullanılarak geliştirilmiştir.

## 📌 Teknolojiler
- **Java** (Test senaryoları için)
- **Selenium WebDriver** (Tarayıcı otomasyonu için)
- **TestNG** (Test yönetimi için)
- **Maven** (Bağımlılık yönetimi için)

## 🚀 Kurulum ve Çalıştırma
Bu projeyi çalıştırabilmek için aşağıdaki yazılımların kurulu olması gerekir:

- **JDK 20** veya daha güncel bir sürüm
- **Maven 3.x**
- **Google Chrome** ya da Chromium tabanlı uyumlu bir tarayıcı

### Gereksinimlerin kurulması
| Platform | JDK | Maven | Chrome |
| --- | --- | --- | --- |
| **Windows/macOS** | [Adoptium](https://adoptium.net/?variant=openjdk20) | [Maven İndir](https://maven.apache.org/download.cgi) | [Google Chrome](https://www.google.com/chrome/) |
| **Linux** | `sudo apt install openjdk-20-jdk` | `sudo apt install maven` | `sudo apt install google-chrome-stable` |

1. **Projeyi klonlayın:**
   ```bash
   git clone https://github.com/yigitcomez/HerokuApp-TestAutomation.git
   cd HerokuApp-TestAutomation
   ```
2. **Bağımlılıkları yükleyin:**
   ```bash
   ./mvnw clean install
   ```
3. **Testleri çalıştırın:**
   ```bash
   ./mvnw test
   ```

## 📄 Test Senaryoları
- **Login Test**: Geçerli ve geçersiz kullanıcı giriş testleri
- **Checkbox Test**: Checkbox'ların doğru çalıştığını kontrol etme
- **Alert Test**: JavaScript uyarı pencereleri testi
- **File Upload Test**: Dosya yükleme fonksiyonunu doğrulama
- **Add/Remove Elements Test**: Eleman ekleme ve silme senaryoları

## 🎥 Demo Videosu
Projenin kullanımına dair kısa videoyu aşağıdaki bağlantıdan izleyebilirsiniz.

[![Kısa Tanıtım](https://img.youtube.com/vi/Vt8a_zDqg_s/0.jpg)](https://www.youtube.com/watch?v=Vt8a_zDqg_s)


## 📄 Lisans
Bu proje **MIT Lisansı** altında lisanslanmıştır.

