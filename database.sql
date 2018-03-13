--
-- PostgreSQL database cluster dump
--

-- Started on 2018-03-13 15:00:55

SET default_transaction_read_only = off;

SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;

--
-- Roles
--

CREATE ROLE postgres;
ALTER ROLE postgres WITH SUPERUSER INHERIT CREATEROLE CREATEDB LOGIN REPLICATION BYPASSRLS PASSWORD 'md524bb002702969490e41e26e1a454036c';






--
-- Database creation
--

REVOKE CONNECT,TEMPORARY ON DATABASE template1 FROM PUBLIC;
GRANT CONNECT ON DATABASE template1 TO PUBLIC;


\connect postgres

SET default_transaction_read_only = off;

--
-- PostgreSQL database dump
--

-- Dumped from database version 10.2
-- Dumped by pg_dump version 10.2

-- Started on 2018-03-13 15:00:55

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 2801 (class 0 OID 0)
-- Dependencies: 2800
-- Name: DATABASE postgres; Type: COMMENT; Schema: -; Owner: postgres
--

COMMENT ON DATABASE postgres IS 'default administrative connection database';


--
-- TOC entry 2 (class 3079 OID 12924)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2803 (class 0 OID 0)
-- Dependencies: 2
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


--
-- TOC entry 1 (class 3079 OID 16384)
-- Name: adminpack; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS adminpack WITH SCHEMA pg_catalog;


--
-- TOC entry 2804 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION adminpack; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION adminpack IS 'administrative functions for PostgreSQL';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 198 (class 1259 OID 24579)
-- Name: pant_price; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE pant_price (
    id integer NOT NULL,
    a double precision,
    b double precision,
    c double precision
);


ALTER TABLE pant_price OWNER TO postgres;

--
-- TOC entry 197 (class 1259 OID 24576)
-- Name: transactions; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE transactions (
    id integer NOT NULL,
    a integer,
    b integer,
    c integer,
    total_num_items integer,
    total_refund double precision
);


ALTER TABLE transactions OWNER TO postgres;

--
-- TOC entry 2795 (class 0 OID 24579)
-- Dependencies: 198
-- Data for Name: pant_price; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY pant_price (id, a, b, c) FROM stdin;
1	1	1.5	3
\.


--
-- TOC entry 2794 (class 0 OID 24576)
-- Dependencies: 197
-- Data for Name: transactions; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY transactions (id, a, b, c, total_num_items, total_refund) FROM stdin;
\.


-- Completed on 2018-03-13 15:00:56

--
-- PostgreSQL database dump complete
--

\connect template1

SET default_transaction_read_only = off;

--
-- PostgreSQL database dump
--

-- Dumped from database version 10.2
-- Dumped by pg_dump version 10.2

-- Started on 2018-03-13 15:00:56

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 2790 (class 0 OID 0)
-- Dependencies: 2789
-- Name: DATABASE template1; Type: COMMENT; Schema: -; Owner: postgres
--

COMMENT ON DATABASE template1 IS 'default template for new databases';


--
-- TOC entry 1 (class 3079 OID 12924)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2792 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


-- Completed on 2018-03-13 15:00:57

--
-- PostgreSQL database dump complete
--

-- Completed on 2018-03-13 15:00:57

--
-- PostgreSQL database cluster dump complete
--

