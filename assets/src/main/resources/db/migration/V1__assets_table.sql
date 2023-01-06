CREATE TABLE assets (
    id uuid DEFAULT gen_random_uuid() PRIMARY KEY,
    name varchar(50),
    description varchar(100)
);

CREATE TABLE cashes (
    decimal_places int NOT NULL,
    smallest_tradable_amount numeric not null,
    biggest_tradable_amount numeric not null
) inherits (assets);

CREATE TABLE instruments (
    smallest_tradable_amount bigint not null,
    biggest_tradable_amount bigint not null
) inherits (assets);

CREATE TABLE qualifications(
    id BIGSERIAL PRIMARY KEY,
    key varchar(50) UNIQUE,
    value varchar(50)
);

CREATE TABLE assets_qualification (
    id BIGSERIAL PRIMARY KEY,
    asset_id uuid NOT NULL references assets(id),
    qualification_id BIGINT NOT NULL references qualifications(id)
);

CREATE INDEX assets_qualification_asset_id_index ON assets_qualification(asset_id);



