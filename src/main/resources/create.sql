CREATE TABLE public.orders
(
  id serial PRIMARY KEY,
  name character varying(50) NOT NULL,
  start_long float NOT NULL,
  start_width float NOT NULL,
  end_long float NOT NULL,
  end_width float NOT NULL,
  status character varying(50) NOT NULL
);