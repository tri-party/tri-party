CREATE TABLE assets (
    id uuid DEFAULT gen_random_uuid() PRIMARY KEY,
    name varchar(50) NOT NULL,
    description varchar(100)
);


CREATE TABLE cashes (
    decimal_places int NOT NULL,
    smallest_tradable_amount numeric not null,
    biggest_tradable_amount numeric not null
) inherits (assets);


CREATE TABLE instruments (
    smallest_tradable_amount numeric not null,
    biggest_tradable_amount numeric not null
) inherits (assets);

CREATE TABLE qualifications(
    id BIGSERIAL PRIMARY KEY,
    key varchar(50),
    value varchar(50)
);

CREATE TABLE assets_qualification (
    asset_id uuid NOT NULL references assets(id),
    qualification_id BIGSERIAL NOT NULL references qualifications(id)
)

