-- initial data for the h2 in memory database, runs at app startup time

insert into ADDRESS (address_id, address_1, address_2, city, state, zip, country) values (999, '123 Lorem Ipsum Ln', 'Foo Bar', 'Minneapolis', 'MN', '54321', 'USA');

insert into USER (user_id, first_name, last_name, email, password, address_id) values (100, 'James', 'Maatman', 'foo@example.com', 'bar123', 999);