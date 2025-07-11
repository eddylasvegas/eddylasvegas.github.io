# :coffee: Автоматизация на Java  
**Проект: Корзина продуктов с поддержкой скидок**  

## :bookmark_tabs: Задачи  
### 1. Иерархия классов продуктов  
- Создание абстрактного класса `Food` с полями: `amount`, `price`, `isVegetarian` :white_check_mark:  
- Реализация классов-наследников: `Meat` и `Apple` (с цветом и скидкой для красных яблок) :white_check_mark:  

### 2. Интерфейсы и скидки  
- Интерфейс `Discountable` с методом `getDiscount()` :white_check_mark:  
- Логика скидки 60% для красных яблок (`colour = "red"`) :white_check_mark:  

### 3. Пакеты и константы  
- Организация пакетов: `model`, `model.constants`, `service` :white_check_mark:  
- Классы для констант: `Discount`, `Colour` :white_check_mark:  

### 4. Корзина продуктов  
- Класс `ShoppingCart` с методами:  
  - Общая сумма без скидки :white_check_mark:  
  - Общая сумма со скидкой :white_check_mark:  
  - Сумма вегетарианских продуктов :white_check_mark:  

### 5. Тестирование логики  
- Создание объектов в `Main`: мясо, красные/зелёные яблоки :white_check_mark:  
- Вывод результатов расчётов :white_check_mark:  

## :hammer_and_wrench: Инструменты  
- Java 11+ :coffee:  
- Maven (pom.xml) :package:  
- IntelliJ IDEA :computer:  

## :file_folder: Структура проекта

```
src/
└── main/
    ├── java/
    │   ├── model/
    │   │   ├── constants/
    │   │   │   ├── Discount.java
    │   │   │   └── Colour.java
    │   │   ├── Food.java
    │   │   ├── Meat.java
    │   │   └── Apple.java
    │   ├── service/
    │   │   └── ShoppingCart.java
    │   └── Main.java
    └── pom.xml
```

---
**Как запустить**:  
1. Клонировать репозиторий.  
2. Открыть в IntelliJ IDEA как Maven-проект.  
3. Запустить `Main.java`. 
