# 🚲 Тестирование API Яндекс.Самокат
**Проект: автоматизированное тестирование REST API сервиса доставки**

## 📋 Тестовые сценарии
### ✔ Тестирование курьеров
- Создание курьера с валидными данными :white_check_mark:
- Попытка дублирования курьера :white_check_mark:
- Авторизация курьера :white_check_mark:
- Обработка ошибок при невалидных данных :white_check_mark:

### ✔ Тестирование заказов
- Создание заказа с разными цветами (BLACK, GREY, оба, без цвета) :white_check_mark:
- Получение списка заказов :white_check_mark:
- Проверка наличия track-номера :white_check_mark:

## 🛠 Технологии
| Компонент       | Версия   |
|----------------|----------|
| Java           | 11       |
| JUnit          | 4.13.2   |
| RestAssured    | 5.5.2    |
| Allure         | 2.29.1   |
| Maven          | 3.8.1    |

## 📂 Структура проекта

```
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ ├── api/
│ │ │ │ ├── ApiConfig.java
│ │ │ │ └── ScooterApiClient.java
│ │ │ ├── models/
│ │ │ │ ├── Courier.java
│ │ │ │ ├── CourierModel.java
│ │ │ │ └── Order.java
│ │ │ ├── steps/
│ │ │ │ ├── CourierTestSteps.java
│ │ │ │ └── OrderTestSteps.java
│ │ │ └── utils/
│ │ │ └── RandomDataGenerator.java
│ └── test/
│ ├── java/
│ │ ├── courier/
│ │ │ ├── CourierCreationTest.java
│ │ │ └── CourierLoginTest.java
│ │ └── order/
│ │ ├── OrderCreationTest.java
│ │ └── OrderListTest.java
│ └── resources/
├── target/
│ └── allure-results/
├── pom.xml
└── README.md
```

## 🚀 Запуск тестов
### Требования:
- Java 11+
- Maven 3.8+
- Allure 2.29+

### Команды:
```bash
# Запуск всех тестов
mvn clean test

# Генерация Allure-отчета
mvn allure:report

# Просмотр отчета
mvn allure:serve

# Запуск отдельных тестов:
mvn test -Dtest=CourierCreationTest     # Тесты создания курьера
mvn test -Dtest=CourierLoginTest       # Тесты авторизации
mvn test -Dtest=OrderCreationTest      # Тесты создания заказа
mvn test -Dtest=OrderListTest          # Тесты списка заказов
