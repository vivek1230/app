-- Create Schema: `app`
IF NOT EXISTS(SELECT * FROM sys.schemas WHERE name='app') EXEC('CREATE SCHEMA app')

-- Create Table: `UserDetails`
IF NOT EXISTS(SELECT * FROM sys.tables t WHERE SCHEMA_NAME(t.schema_id) = 'app' AND t.name = 'UserDetails')
BEGIN
    CREATE TABLE app.UserDetails(
        UserId bigint IDENTITY,
        Name nvarchar(20) NOT NULL,
        Email nvarchar(20) NOT NULL,
        Mobile nvarchar(20) NOT NULL,
        LastUpdated datetimeoffset NOT NULL default(current_timestamp),
        CONSTRAINT PK_UserDetails PRIMARY KEY (Email)
    )
END;


-- Create Schema: `app`
IF NOT EXISTS(select * FROM sys.schemas WHERE name='app') EXEC('CREATE SCHEMA app');

-- Create Table: `UserDetails`
IF NOT EXISTS(SELECT * FROM sys.tables t WHERE SCHEMA_NAME(t.schema_id) = 'app' AND t.name='UserDetails')
BEGIN
    CREATE TABLE app.UserDetails(
        Name nvarchar(20) NOT NULL,
        Email nvarchar(20) NOT NULL,
        Mobile nvarchar(20) NOT NULL,
        LastUpdated datetimeoffset NOT NULL default(current_timestamp),
        CONSTRAINT PK_UserDetails PRIMARY KEY (Email)
    )
END;


-- Create Schema: `app`
IF NOT EXISTS(select * FROM sys.schemas WHERE name='app') EXEC('CREATE SCHEMA app');

-- Create Table: `UserDetails`
IF NOT EXISTS(SELECT * FROM sys.tables t WHERE SCHEMA_NAME(t.schema_id) = 'app' AND t.name='UserDetails')
BEGIN
    CREATE TABLE app.UserDetails(
        Name nvarchar(20) NOT NULL,
        Email nvarchar(20) NOT NULL,
        Mobile nvarchar(20) NOT NULL,
        LastUpdated datetimeoffset NOT NULL default(current_timestamp),
        CONSTRAINT PK_UserDetails PRIMARY KEY (Email)
    )
END;
