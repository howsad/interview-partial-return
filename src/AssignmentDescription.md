В данном задании необходимо реализовать один метод API для мобильного приложения курьера.
Метод имплементирует логику частичного возврата заказа.
Как это работает? Курьер приезжает к клиенту для того чтобы доставить заказы, состоящие каждый из нескольких товарных позиций.
Клиент может отказаться от части товарных позиций из каждого заказа. Необходимо:

1. Обсудить схему базы данных
2. Предложить спецификацию эндпоинта, регистрирующего частичный возврат
3. Главная часть: реализовать логику сервиса, который:
  a) валидирует что можно выкупить только если более 30% общей суммы от стоимости всех товарных позиций всех заказов выкупается
  б) товарные позиции могут входить в бандлы - неразделяемые группы позиций, которые или полностью должны быть выкуплены или возвращены. Необходимо хранить принадлежность к бандлу в базе даныых и добавить такую валидацию
  в) использовать http-клиент для внешнего сервиса AntifraudClient для валидации состава
4. Сохранить изменения в базу данных



