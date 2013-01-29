DELIMITER $$

CREATE
    /*[DEFINER = { user | CURRENT_USER }]*/
    TRIGGER `cadcli`.`cli` BEFORE/AFTER INSERT/UPDATE/DELETE
    ON `cadcli`.`<Table Name>`
    FOR EACH ROW BEGIN

    END$$

DELIMITER ;