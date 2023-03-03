insert into EQUIPMENT (NAME)
values  ('Transformer-500/220'),
        ('AT-2');

insert into MEASUREMENTS (UA, UB, UC, IA, IB, IC, EQUIPMENT_ID)
values (10, 10, 10, 20, 20, 20, 1),
       (12, 12, 12, 22, 22, 22, 1),
       (12, 15, 12, 22, 22, 22, 1),
       (12, 20, 12, 22, 22, 22, 1),
       (12, 15, 12, 22, 22, 22, 1);
