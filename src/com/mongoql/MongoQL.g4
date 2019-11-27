grammar MongoQL;
query: selectClause
        fromClause
        (whereClause)? (orderByClause)? (WS)? ';';
WS : (' ' | '\t' | '\r' | '\n') {skip();};
//WS : [ \t\r\n]+ -> skip ;

selectClause: 'SELECT' WS? projAttrs WS?;
projAttrs: projList | '*';
projList: nestedField (',' (WS)? projList)?;
nestedField: field '.' nestedField | field;
field: ID;

fromClause: 'FROM' WS? collection;
collection: ID;

whereClause: WS? 'WHERE' WS? exprList;
exprList:
    '(' WS? exprList WS? ')' (WS? logOp WS? exprList)?|
    expr (WS? logOp WS? exprList)?
    ;
expr: nestedField (WS)? relOp (WS)? value;
logOp: 'AND' | 'OR';
relOp: '=' | '!=' | '<' | '<=' | '>' | '>=';
value: NUMBER|BOOLEAN|STRING|nestedField;

orderByClause: WS? 'ORDER BY' WS? field (WS?) (orderByOpt)?;
orderByOpt: ('ASC'|'DESC');

NUMBER: [0-9]+;
BOOLEAN: ( 'TRUE' | 'FALSE' );
STRING:
    ('"' ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')+ '"') |
    ('\'' ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')+ '\'')
;

ID : ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;
CHARACTER: ('a'..'z' | 'A'..'Z' | '0'..'9' | '_' );

