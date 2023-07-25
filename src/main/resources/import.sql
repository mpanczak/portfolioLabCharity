INSERT INTO categories (id, name) VALUES (1, 'ubrania');
INSERT INTO categories (id, name) VALUES (2, 'zabawki');


INSERT INTO institutions (id, name, description) VALUES (1, 'Dbam o Zdrowie', 'Pomoc dzieciom z ubogich rodzin.');
INSERT INTO institutions (id, name, description) VALUES (2, 'A kogo', 'Pomoc wybudzaniu dzieci ze śpiączki.');


INSERT INTO donations (id, city, pick_up_comment, pick_up_date, pick_up_time, quantity, street, zip_code) VALUES (1, 'Warszawa', 'Zdrówka', CURRENT_DATE, CURRENT_TIME, 2, 'Długa 13', '01-950');
INSERT INTO donations (id, city, pick_up_comment, pick_up_date, pick_up_time, quantity, street, zip_code, institution_id) VALUES ();

INSERT INTO donations_categories (donation_id, categories_id) VALUES (1, 1)