INSERT INTO users (username, password, role, created_at, updated_at) VALUES ('David', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', 'ROLE_BOSS', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
INSERT INTO users (username, password, role, created_at, updated_at) VALUES ('Simon', 'asd123', 'ROLE_GUEST', '2019-10-09 12:33:53', '2019-10-09 12:33:53');

INSERT INTO foods (name, description, calories, status, created_at, updated_at, created_by_id, updated_by_id) VALUES ('Kelkáposzta főzelék', 'Ez egy főzelék, melyben kelkáposzta, burgonya található főleg és fasírtal tálaljuk.', 247, 'STATUS_PROCESSING', '2019-10-09 12:33:53', '2019-10-09 12:33:53', 1, 1);
INSERT INTO foods (name, description, calories, status, created_at, updated_at, created_by_id, updated_by_id) VALUES ('Borsos tokány szarvacska tésztával', 'Ez egy tészta étel, tokánnyal a tetején.', 401, 'STATUS_PROCESSING', '2019-10-09 12:33:53', '2019-10-09 12:33:53', 1, 1);

INSERT INTO orders (destination, description, created_at) VALUES ('Nagy Lajos u. 42 4/1', 'Semmi megjegyzés nem érkezett!', CURRENT_TIMESTAMP());

INSERT INTO ingredients (name) VALUES ('Paprika');
INSERT INTO ingredients (name) VALUES ('Vöröshagyma');
INSERT INTO ingredients (name) VALUES ('Paradicsom');
INSERT INTO ingredients (name) VALUES ('Lilahagyma');
INSERT INTO ingredients (name) VALUES ('Burgonya');
INSERT INTO ingredients (name) VALUES ('Rizs');
INSERT INTO ingredients (name) VALUES ('Uborka');
INSERT INTO ingredients (name) VALUES ('Cukkini');