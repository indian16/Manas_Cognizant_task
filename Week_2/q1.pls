BEGIN
    FOR customer IN (
        SELECT customer_id, interest_rate
        FROM loans
        JOIN customers USING (customer_id)
        WHERE age > 60
    ) LOOP
        UPDATE loans
        SET interest_rate = interest_rate - (interest_rate * 0.01)
        WHERE customer_id = customer.customer_id;
    END LOOP;

    COMMIT;
END;
