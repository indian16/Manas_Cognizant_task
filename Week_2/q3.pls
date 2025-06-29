DECLARE
    v_due_date DATE;
    v_name VARCHAR2(100);
BEGIN
    FOR loan IN (
        SELECT c.customer_id, c.name, l.due_date
        FROM loans l
        JOIN customers c ON l.customer_id = c.customer_id
        WHERE l.due_date BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Dear ' || loan.name || ', your loan is due on ' || TO_CHAR(loan.due_date, 'DD-Mon-YYYY')
        );
    END LOOP;
END;
