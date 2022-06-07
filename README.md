## Описание
### Сервис который обращается к сервису курсов валют, и отображает gif:
+ **если курс по отношению к USD за сегодня стал выше вчерашнего, то отдаем рандомную отсюда https://giphy.com/search/rich**
+ **если ниже - отсюда https://giphy.com/search/broke**

## Запустить сервис локально

```
git clone https://github.com/ferveks3509/exchangerates
gradle build
http://localhost:8080/giphy
```
##Запустить сервис в docker image
```
git clone https://github.com/ferveks3509/exchangerates
cd currencychecker
gradle build
docker build -t exchangerates .
docker run -p 8080:8080 exchangerates
```
