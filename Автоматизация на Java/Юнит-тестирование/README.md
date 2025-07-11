# 🐱 Юнит-тесты для зоологической программы  
**Проект: тестирование системы исследования семейства кошачьих**  

## 📋 Тестовые сценарии  
### ✔ Тестирование класса Feline  
- Проверка методов получения семейства и пищи  
- Тестирование размножения с параметризацией  

### ✔ Тестирование класса Cat  
- Верификация звуков и поведения  
- Проверка пищевых привычек через Mock  

### ✔ Тестирование класса Lion  
- Параметризованные тесты для разных полов  
- Проверка охотничьих характеристик  

## 🛠 Технологии  
| Компонент       | Версия   |  
|----------------|----------|  
| Java           | 11       |  
| JUnit          | 4.13.2   |  
| Mockito        | 5.17.0   |  
| JaCoCo         | 0.8.13   |  
| Maven          | 3.8.1    |  

## 📂 Структура проекта  

```
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/
│ │ │ └── example/
│ │ │ ├── Animal.java
│ │ │ ├── Cat.java
│ │ │ ├── Feline.java
│ │ │ ├── Lion.java
│ │ │ └── Predator.java
│ │ └── resources/
│ │ └── read.me
│ └── test/
│ ├── java/
│ │ ├── CatTest.java
│ │ ├── FelineTest.java
│ │ ├── LionParametrizedTest.java
│ │ └── LionTest.java
│ └── resources/
│ └── read.me
├── pom.xml
└── README.md
```


## 🚀 Запуск тестов
### Требования:
- JDK 11
- Maven 3.8+

### Команды:
```bash
# Сборка и запуск всех тестов
mvn clean test

# Запуск с генерацией отчета покрытия
mvn jacoco:report

# Запуск конкретного тестового класса
mvn test -Dtest=FelineTest             # Тесты для Feline
mvn test -Dtest=CatTest                # Тесты для Cat
mvn test -Dtest=LionTest               # Базовые тесты Lion
mvn test -Dtest=LionParametrizedTest   # Параметризованные тесты Lion
