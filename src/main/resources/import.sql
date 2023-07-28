INSERT INTO categories (id, name) VALUES (1, 'ubrania, które nadają się do ponownego użycia'), (2, 'ubrania, do wyrzucenia'), (3, 'zabawki'), (4, 'książki'), (5, 'inne');


INSERT INTO institutions (id, name, description) VALUES (1, 'Dbam o Zdrowie', 'Pomoc dzieciom z ubogich rodzin.');
INSERT INTO institutions (id, name, description) VALUES (2, 'A kogo', 'Pomoc wybudzaniu dzieci ze śpiączki.');
INSERT INTO institutions (id, name, description) VALUES (3, 'Dla dzieci', 'Pomoc osobom znajdującym się w trudnej sytuacji życiowej.');
INSERT INTO institutions (id, name, description) VALUES (4, 'Bez domu', 'Pomoc dla osób nie posiadających miejsca zamieszkania');


INSERT INTO donations (id, city, pick_up_comment, pick_up_date, pick_up_time, quantity, street, zip_code, institution_id) VALUES (1, 'Warszawa', 'Zdrówka', CURRENT_DATE, CURRENT_TIME, 2, 'Długa 13', '01-950', 1);
INSERT INTO donations (id, city, pick_up_comment, pick_up_date, pick_up_time, quantity, street, zip_code, institution_id) VALUES (2, 'Wrocław', 'Comment', CURRENT_DATE, CURRENT_TIME, 5, '', '38-484', 2);

INSERT INTO donations_categories (donation_id, categories_id) VALUES (1, 1)