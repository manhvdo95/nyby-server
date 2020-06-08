CREATE TABLE nyby_post (
    id BIGSERIAL PRIMARY KEY,
    username text,
    description text,
    image_url text,
    created_on timestamp with time zone,
    last_modified_on timestamp with time zone
);

INSERT INTO nyby_post(username, description, image_url, created_on, last_modified_on) VALUES
('user1', 'some description', 'google.com', now(), now());