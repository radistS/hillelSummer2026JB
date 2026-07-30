# 30 практичних задач з ООП на Java

## Загальні вимоги

Кожна задача повинна демонструвати:

-   Інкапсуляцію (`private` поля, контроль доступу через методи).
-   Наслідування (базовий або абстрактний клас).
-   Поліморфізм (робота через базовий тип або інтерфейс).
-   Перевизначення методів (`@Override`).
-   Використання колекцій (`List<BaseClass>`).
-   За можливості --- композицію та інтерфейси.

------------------------------------------------------------------------

## 1. Домашні тварини

Базовий клас: `Animal` Нащадки: `Cat`, `Dog`, `Parrot` Методи: `eat()`,
`sleep()`, `makeSound()`, `play()`.

## 2. Тварини в зоопарку

Базовий клас: `ZooAnimal` Нащадки: `Lion`, `Elephant`, `Monkey`,
`Penguin` Створити клас `Zoo`, який зберігає список тварин та підраховує
добову кількість корму.

## 3. Транспорт

Базовий клас: `Vehicle` Нащадки: `Car`, `Bus`, `Motorcycle`, `Bicycle`
Методи: `start()`, `stop()`, `move()`, `calculateTravelCost()`.

## 4. Працівники компанії

Базовий клас: `Employee` Нащадки: `Developer`, `Tester`, `Manager`,
`Designer` Різний розрахунок зарплати та бонусів.

## 5. Банківські рахунки

Базовий клас: `BankAccount` Нащадки: `DebitAccount`, `CreditAccount`,
`SavingsAccount`.

## 6. Способи оплати

Інтерфейс: `PaymentMethod` Реалізації: картка, готівка, банківський
переказ, криптовалюта.

## 7. Геометричні фігури

Базовий клас: `Shape` Нащадки: `Circle`, `Rectangle`, `Triangle`,
`Square`.

## 8. Персонажі RPG

Базовий клас: `GameCharacter` Нащадки: `Warrior`, `Mage`, `Archer`.

## 9. Противники

Базовий клас: `Enemy` Нащадки: `Goblin`, `Orc`, `Dragon`, `Skeleton`.

## 10. Зброя

Базовий клас: `Weapon` Нащадки: `Sword`, `Bow`, `MagicStaff`, `Axe`.

## 11. Доставка

Базовий клас: `Delivery` Нащадки: `CourierDelivery`, `PostalDelivery`,
`PickupDelivery`, `DroneDelivery`.

## 12. Сповіщення

Інтерфейс: `Notification` Реалізації: Email, SMS, Push, Telegram.

## 13. Бібліотечні матеріали

Базовий клас: `LibraryItem` Нащадки: `Book`, `Magazine`, `Newspaper`,
`AudioBook`.

## 14. Товари магазину

Базовий клас: `Product` Нащадки: `FoodProduct`, `ElectronicProduct`,
`ClothingProduct`, `DigitalProduct`.

## 15. Меню ресторану

Базовий клас: `MenuItem` Нащадки: `MainDish`, `Drink`, `Dessert`,
`Pizza`.

## 16. Користувачі системи

Базовий клас: `User` Нащадки: `Administrator`, `Manager`, `Customer`,
`Guest`.

## 17. Навчальні курси

Базовий клас: `Course` Нащадки: `ProgrammingCourse`, `LanguageCourse`,
`DesignCourse`, `MathCourse`.

## 18. Студенти

Базовий клас: `Student` Нащадки: `SchoolStudent`, `CollegeStudent`,
`UniversityStudent`.

## 19. Медичний персонал

Базовий клас: `MedicalEmployee` Нащадки: `Doctor`, `Nurse`, `Surgeon`,
`LaboratoryAssistant`.

## 20. Медичні послуги

Базовий клас: `MedicalService` Нащадки: `Consultation`, `BloodTest`,
`Surgery`, `Vaccination`.

## 21. Розумний будинок

Базовий клас: `SmartDevice` Нащадки: `SmartLamp`, `SmartTV`,
`AirConditioner`, `RobotVacuum`.

## 22. Роботи

Базовий клас: `Robot` Нащадки: `CleaningRobot`, `DeliveryRobot`,
`IndustrialRobot`, `MedicalRobot`.

## 23. Файли

Базовий клас: `File` Нащадки: `TextFile`, `ImageFile`, `AudioFile`,
`VideoFile`.

## 24. Медіаплеєр

Інтерфейс: `Playable` Реалізації: `Song`, `Movie`, `Podcast`,
`AudioBook`.

## 25. Платники податків

Базовий клас: `TaxPayer` Нащадки: `EmployeeTaxPayer`,
`EntrepreneurTaxPayer`, `CompanyTaxPayer`.

## 26. Страхові поліси

Базовий клас: `InsurancePolicy` Нащадки: `CarInsurance`,
`HealthInsurance`, `TravelInsurance`, `PropertyInsurance`.

## 27. Оренда транспорту

Базовий клас: `RentalVehicle` Нащадки: `RentalCar`, `RentalBike`,
`RentalScooter`, `RentalVan`.

## 28. Комп'ютерна техніка

Базовий клас: `Computer` Композиція: `Processor`, `Memory`, `Storage`,
`VideoCard`.

## 29. Автосервіс

Класи: `ServiceStation`, `Mechanic`, `RepairOrder`, `Vehicle`.
Реалізувати взаємодію між об'єктами.

## 30. Консольна RPG

Реалізувати гру з класами: - `Game` - `Player` - `Enemy` - `Weapon` -
`Inventory` - `Location` - `Battle`

Використати всі принципи ООП: інкапсуляцію, наслідування, поліморфізм,
абстракцію, композицію та інтерфейси.

------------------------------------------------------------------------

## Рекомендована структура кожної роботи

1.  Визначити предметну область.
2.  Виділити класи.
3.  Спроєктувати поля.
4.  Реалізувати конструктори.
5.  Додати інкапсуляцію.
6.  Реалізувати спадкування.
7.  Використати поліморфізм.
8.  Створити тестовий сценарій у `main()`.
9.  Перевірити роботу всіх методів.
10. За бажанням розширити програму новими можливостями.
