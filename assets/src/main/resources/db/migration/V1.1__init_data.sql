insert into qualifications values (1, 'country', 'usa');
insert into qualifications values (2, 'fiat', 'true');
insert into qualifications values (3, 'crypto', 'true');

insert into assets values ('7b19c60b-200f-45a0-b422-41de8692e1ba', 'usd_currency', 'official us currency');
insert into assets values ('a6a3663d-84b3-4109-9c49-d8e056800160', 'BTC_currency', 'main crypto');
insert into assets values ('d99fd97c-6e82-4195-9f52-4ff65ae8baef', 'usd_bond_10y', 'official us currency');

insert into cashes values (1, '7b19c60b-200f-45a0-b422-41de8692e1ba', 2, 0.01, 1000000);
insert into cashes values (2, 'a6a3663d-84b3-4109-9c49-d8e056800160', 8, 0.00000001, 10);
insert into instruments values (3, 'd99fd97c-6e82-4195-9f52-4ff65ae8baef', 1, 10);

insert into assets_qualification (asset_id, qualification_id) values ('7b19c60b-200f-45a0-b422-41de8692e1ba', 1);
insert into assets_qualification (asset_id, qualification_id) values ('7b19c60b-200f-45a0-b422-41de8692e1ba', 2);

insert into assets_qualification (asset_id, qualification_id) values ('a6a3663d-84b3-4109-9c49-d8e056800160', 3);

insert into assets_qualification (asset_id, qualification_id) values ('d99fd97c-6e82-4195-9f52-4ff65ae8baef', 1);