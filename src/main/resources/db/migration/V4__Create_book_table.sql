create sequence book_seq start with 1 increment by 50;

create table book (
    id bigint not null,
    book_title VARCHAR(255) NOT NULL,
    book_authors VARCHAR(255),
    book_price DECIMAL(10, 2)
);