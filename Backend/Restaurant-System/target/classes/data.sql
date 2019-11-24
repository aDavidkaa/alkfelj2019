INSERT INTO orders (destination, description, created_at) VALUES ('Nagy Lajos u. 42 4/1', 'Semmi megjegyzés nem érkezett!', CURRENT_TIMESTAMP());

INSERT INTO users (user_name, password, role) VALUES ('admin', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', 'ROLE_ADMIN');
INSERT INTO users (user_name, password, role) VALUES ('zek', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', 'ROLE_USER');

INSERT INTO ingredients(name, created_by_id, created_at) VALUES ('Kaposzta', 1, '2019-01-01');

INSERT INTO foods (name, description, calories, status, created_at, updated_at, created_by_id, updated_by_id) VALUES ('Kelkáposzta főzelék', 'Ez egy főzelék, melyben kelkáposzta, burgonya található főleg és fasírtal tálaljuk.', 247, 'STATUS_PROCESSING', '2019-10-09 12:33:53', '2019-10-09 12:33:53', 1, 1);
INSERT INTO foods (name, description, calories, status, created_at, updated_at, created_by_id, updated_by_id) VALUES ('Borsos tokány szarvacska tésztával', 'Ez egy tészta étel, tokánnyal a tetején.', 401, 'STATUS_PROCESSING', '2019-10-09 12:33:53', '2019-10-09 12:33:53', 1, 1);


INSERT INTO ingredients (name, created_by_id, created_at) VALUES ('Paprika',  1, '2019-01-01');
INSERT INTO ingredients (name, created_by_id, created_at) VALUES ('Vöröshagyma', 1, '2019-01-01');
INSERT INTO ingredients (name, created_by_id, created_at) VALUES ('Paradicsom', 1, '2019-01-01');
INSERT INTO ingredients (name, created_by_id, created_at) VALUES ('Lilahagyma', 1, '2019-01-01');
INSERT INTO ingredients (name, created_by_id, created_at) VALUES ('Burgonya', 1, '2019-01-01');
INSERT INTO ingredients (name, created_by_id, created_at) VALUES ('Rizs', 1, '2019-01-01');
INSERT INTO ingredients (name, created_by_id, created_at) VALUES ('Uborka', 1, '2019-01-01');
INSERT INTO ingredients (name, created_by_id, created_at) VALUES ('Cukkini', 1, '2019-01-01');

INSERT INTO foods_ingredient(food_id, ingredient_id) VALUES(1,2);
INSERT INTO foods_ingredient(food_id, ingredient_id) VALUES(1,1);
INSERT INTO foods_ingredient(food_id, ingredient_id) VALUES(1,3);
INSERT INTO foods_ingredient(food_id, ingredient_id) VALUES(1,4);

