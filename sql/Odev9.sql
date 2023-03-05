-- Soru 1 / city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız:

SELECT city, country FROM city
INNER JOIN country ON city.country_id = country.country_id;



-- Soru 2 / customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız:

SELECT payment.payment_id, customer.first_name, customer.last_name FROM payment
JOIN customer ON customer.customer_id = payment.customer_id;

-- Derslerde de bahsedildiği gibi, INNER JOIN yapısı hakkında "kesişim kümesi" diyebileceğimiz için, ilk satırın sonunda yer alan payment ile JOIN'den sonra yer alan customer yer değiştirse bile sorgu sonucumuzda herhangi bir değişiklik olmayacak. 



-- Soru 3 / customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız:

SELECT rental.rental_id, customer.first_name, customer.last_name FROM customer
JOIN rental ON rental.customer_id = customer.customer_id;




