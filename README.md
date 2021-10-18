<H1>Выполнение домашнего задания по курсу GB</H1>

<H4>Тестирование Api документации интернет-магазина</H4>

Swagger Api: http://80.78.248.82:8189/market/swagger-ui.html

<H5>Было протестировано:</H5>

<H5>Позитивные проверки:</H5>

- Получение списка продуктов
- Получение продукта по ID
- Создание продукта
- Получение категорий по ID
- Удаление продукта
- Обновление продукта
- Удаление продукта сразу после его создания

<H5>Негативные проверки:</H5>

- Получение продукта по ошибочному ID (code 404)
- Создание пустого продукта (code 500)
- Создание продукта c длинным именем (code 500)
- Удаление несуществующего продукта (code 500)
- Обновление продукта с ошибочным ID (code 400)
