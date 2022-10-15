CREATE TABLE IF NOT EXISTS stats (
    id INTEGER,
    weight_class_id INTEGER,
    division VARCHAR(32),
    arm VARCHAR(32),
    first_name VARCHAR(32),
    last_name VARCHAR(32),
    elo REAL,
    created timestamp,
    PRIMARY KEY (id, weight_class_id, division, arm)
)