CREATE TABLE user_info (
    id uuid DEFAULT gen_random_uuid() PRIMARY KEY,
    email varchar(50) NOT NULL
)