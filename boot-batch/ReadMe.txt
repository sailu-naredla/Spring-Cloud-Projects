1. SQL queries to verify the entries

select * from USER;

select * from BATCH_JOB_EXECUTION;
select * from BATCH_JOB_EXECUTION_CONTEXT;

select * from BATCH_STEP_EXECUTION;
select * from BATCH_STEP_EXECUTION_CONTEXT;


2. Rest Controller to initiate JOB
http://localhost:8080/load


3. H2 DB access :

http://localhost:8080/h2-console