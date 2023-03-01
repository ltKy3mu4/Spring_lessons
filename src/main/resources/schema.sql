-- DROP TABLE IF EXISTS BOOKS;
-- DROP TABLE IF EXISTS AUTHORS;
DROP TABLE IF EXISTS MEASUREMENTS;

CREATE TABLE MEASUREMENTS
(
    ID      bigint              generated by default as identity,
    UA      DOUBLE PRECISION    NOT NULL,
    UB      DOUBLE PRECISION    NOT NULL,
    UC      DOUBLE PRECISION    NOT NULL,
    IA      DOUBLE PRECISION    NOT NULL,
    IB      DOUBLE PRECISION    NOT NULL,
    IC      DOUBLE PRECISION    NOT NULL
);
--
-- CREATE TABLE AUTHORS
-- (
--     AUTHOR_ID  bigint generated by default as identity,
--     FIRST_NAME VARCHAR(255) NOT NULL,
--     LAST_NAME  VARCHAR(255) NOT NULL,
--     primary key (AUTHOR_ID)
-- );
--
-- CREATE TABLE BOOKS
-- (
--     ID        bigint generated by default as identity,
--     NAME      VARCHAR(255),
--     AUTHOR_ID BIGINT NOT NULL,
--     GENRE_ID  BIGINT NOT NULL,
--     primary key (ID),
--     FOREIGN KEY (GENRE_ID) REFERENCES GENRE (GENRE_ID),
--     FOREIGN KEY (AUTHOR_ID) REFERENCES AUTHORS (AUTHOR_ID)
-- );
--
-- CREATE TABLE COMMENTS
-- (
--     ID        bigint generated by default as identity,
--     BODY      VARCHAR(255),
--     BOOK_ID   BIGINT NOT NULL,
--     FOREIGN KEY (BOOK_ID) REFERENCES BOOKS (ID),
--     primary key (ID)
-- );