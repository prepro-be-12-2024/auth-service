create table if not exists users (
    id          VARCHAR(36)     PRIMARY KEY,
    username    VARCHAR(255)    UNIQUE NOT NULL,
    password    VARCHAR(255)    NOT NULL,
    suspended   BIT             NOT NULL DEFAULT 0,
    deleted     BIT             NOT NULL DEFAULT 0,
    created_at  DATETIME        DEFAULT NOW(),
    created_by  VARCHAR(255)    DEFAULT 'DBA',
    updated_at  DATETIME        NULL,
    updated_by  VARCHAR(255)    NULL
)