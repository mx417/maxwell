// Generated from com/zendesk/maxwell/schema/ddl/mysql.g4 by ANTLR 4.5
package com.zendesk.maxwell.schema.ddl;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mysqlParser}.
 */
public interface mysqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mysqlParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(mysqlParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(mysqlParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(mysqlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(mysqlParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#tokens_available_for_names}.
	 * @param ctx the parse tree
	 */
	void enterTokens_available_for_names(mysqlParser.Tokens_available_for_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#tokens_available_for_names}.
	 * @param ctx the parse tree
	 */
	void exitTokens_available_for_names(mysqlParser.Tokens_available_for_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#all_tokens}.
	 * @param ctx the parse tree
	 */
	void enterAll_tokens(mysqlParser.All_tokensContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#all_tokens}.
	 * @param ctx the parse tree
	 */
	void exitAll_tokens(mysqlParser.All_tokensContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#skip_parens}.
	 * @param ctx the parse tree
	 */
	void enterSkip_parens(mysqlParser.Skip_parensContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#skip_parens}.
	 * @param ctx the parse tree
	 */
	void exitSkip_parens(mysqlParser.Skip_parensContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#db_name}.
	 * @param ctx the parse tree
	 */
	void enterDb_name(mysqlParser.Db_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#db_name}.
	 * @param ctx the parse tree
	 */
	void exitDb_name(mysqlParser.Db_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(mysqlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(mysqlParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#user}.
	 * @param ctx the parse tree
	 */
	void enterUser(mysqlParser.UserContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#user}.
	 * @param ctx the parse tree
	 */
	void exitUser(mysqlParser.UserContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#user_token}.
	 * @param ctx the parse tree
	 */
	void enterUser_token(mysqlParser.User_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#user_token}.
	 * @param ctx the parse tree
	 */
	void exitUser_token(mysqlParser.User_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(mysqlParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(mysqlParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#name_all_tokens}.
	 * @param ctx the parse tree
	 */
	void enterName_all_tokens(mysqlParser.Name_all_tokensContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#name_all_tokens}.
	 * @param ctx the parse tree
	 */
	void exitName_all_tokens(mysqlParser.Name_all_tokensContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(mysqlParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(mysqlParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(mysqlParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(mysqlParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#literal_with_weirdo_multistring}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_with_weirdo_multistring(mysqlParser.Literal_with_weirdo_multistringContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#literal_with_weirdo_multistring}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_with_weirdo_multistring(mysqlParser.Literal_with_weirdo_multistringContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#float_literal}.
	 * @param ctx the parse tree
	 */
	void enterFloat_literal(mysqlParser.Float_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#float_literal}.
	 * @param ctx the parse tree
	 */
	void exitFloat_literal(mysqlParser.Float_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void enterInteger_literal(mysqlParser.Integer_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void exitInteger_literal(mysqlParser.Integer_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(mysqlParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(mysqlParser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#byte_literal}.
	 * @param ctx the parse tree
	 */
	void enterByte_literal(mysqlParser.Byte_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#byte_literal}.
	 * @param ctx the parse tree
	 */
	void exitByte_literal(mysqlParser.Byte_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(mysqlParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(mysqlParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(mysqlParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(mysqlParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#charset_name}.
	 * @param ctx the parse tree
	 */
	void enterCharset_name(mysqlParser.Charset_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#charset_name}.
	 * @param ctx the parse tree
	 */
	void exitCharset_name(mysqlParser.Charset_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#default_character_set}.
	 * @param ctx the parse tree
	 */
	void enterDefault_character_set(mysqlParser.Default_character_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#default_character_set}.
	 * @param ctx the parse tree
	 */
	void exitDefault_character_set(mysqlParser.Default_character_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#default_collation}.
	 * @param ctx the parse tree
	 */
	void enterDefault_collation(mysqlParser.Default_collationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#default_collation}.
	 * @param ctx the parse tree
	 */
	void exitDefault_collation(mysqlParser.Default_collationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#charset_token}.
	 * @param ctx the parse tree
	 */
	void enterCharset_token(mysqlParser.Charset_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#charset_token}.
	 * @param ctx the parse tree
	 */
	void exitCharset_token(mysqlParser.Charset_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#collation}.
	 * @param ctx the parse tree
	 */
	void enterCollation(mysqlParser.CollationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#collation}.
	 * @param ctx the parse tree
	 */
	void exitCollation(mysqlParser.CollationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#if_not_exists}.
	 * @param ctx the parse tree
	 */
	void enterIf_not_exists(mysqlParser.If_not_existsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#if_not_exists}.
	 * @param ctx the parse tree
	 */
	void exitIf_not_exists(mysqlParser.If_not_existsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table(mysqlParser.Alter_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table(mysqlParser.Alter_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#alter_table_preamble}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_preamble(mysqlParser.Alter_table_preambleContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#alter_table_preamble}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_preamble(mysqlParser.Alter_table_preambleContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#alter_flags}.
	 * @param ctx the parse tree
	 */
	void enterAlter_flags(mysqlParser.Alter_flagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#alter_flags}.
	 * @param ctx the parse tree
	 */
	void exitAlter_flags(mysqlParser.Alter_flagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#alter_specifications}.
	 * @param ctx the parse tree
	 */
	void enterAlter_specifications(mysqlParser.Alter_specificationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#alter_specifications}.
	 * @param ctx the parse tree
	 */
	void exitAlter_specifications(mysqlParser.Alter_specificationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#alter_specification}.
	 * @param ctx the parse tree
	 */
	void enterAlter_specification(mysqlParser.Alter_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#alter_specification}.
	 * @param ctx the parse tree
	 */
	void exitAlter_specification(mysqlParser.Alter_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#add_column}.
	 * @param ctx the parse tree
	 */
	void enterAdd_column(mysqlParser.Add_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#add_column}.
	 * @param ctx the parse tree
	 */
	void exitAdd_column(mysqlParser.Add_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#add_column_parens}.
	 * @param ctx the parse tree
	 */
	void enterAdd_column_parens(mysqlParser.Add_column_parensContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#add_column_parens}.
	 * @param ctx the parse tree
	 */
	void exitAdd_column_parens(mysqlParser.Add_column_parensContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#change_column}.
	 * @param ctx the parse tree
	 */
	void enterChange_column(mysqlParser.Change_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#change_column}.
	 * @param ctx the parse tree
	 */
	void exitChange_column(mysqlParser.Change_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#drop_column}.
	 * @param ctx the parse tree
	 */
	void enterDrop_column(mysqlParser.Drop_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#drop_column}.
	 * @param ctx the parse tree
	 */
	void exitDrop_column(mysqlParser.Drop_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#old_col_name}.
	 * @param ctx the parse tree
	 */
	void enterOld_col_name(mysqlParser.Old_col_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#old_col_name}.
	 * @param ctx the parse tree
	 */
	void exitOld_col_name(mysqlParser.Old_col_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#modify_column}.
	 * @param ctx the parse tree
	 */
	void enterModify_column(mysqlParser.Modify_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#modify_column}.
	 * @param ctx the parse tree
	 */
	void exitModify_column(mysqlParser.Modify_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#drop_key}.
	 * @param ctx the parse tree
	 */
	void enterDrop_key(mysqlParser.Drop_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#drop_key}.
	 * @param ctx the parse tree
	 */
	void exitDrop_key(mysqlParser.Drop_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#drop_primary_key}.
	 * @param ctx the parse tree
	 */
	void enterDrop_primary_key(mysqlParser.Drop_primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#drop_primary_key}.
	 * @param ctx the parse tree
	 */
	void exitDrop_primary_key(mysqlParser.Drop_primary_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#alter_rename_table}.
	 * @param ctx the parse tree
	 */
	void enterAlter_rename_table(mysqlParser.Alter_rename_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#alter_rename_table}.
	 * @param ctx the parse tree
	 */
	void exitAlter_rename_table(mysqlParser.Alter_rename_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#convert_to_character_set}.
	 * @param ctx the parse tree
	 */
	void enterConvert_to_character_set(mysqlParser.Convert_to_character_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#convert_to_character_set}.
	 * @param ctx the parse tree
	 */
	void exitConvert_to_character_set(mysqlParser.Convert_to_character_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#rename_column}.
	 * @param ctx the parse tree
	 */
	void enterRename_column(mysqlParser.Rename_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#rename_column}.
	 * @param ctx the parse tree
	 */
	void exitRename_column(mysqlParser.Rename_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#alter_partition_specification}.
	 * @param ctx the parse tree
	 */
	void enterAlter_partition_specification(mysqlParser.Alter_partition_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#alter_partition_specification}.
	 * @param ctx the parse tree
	 */
	void exitAlter_partition_specification(mysqlParser.Alter_partition_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#ignored_alter_specifications}.
	 * @param ctx the parse tree
	 */
	void enterIgnored_alter_specifications(mysqlParser.Ignored_alter_specificationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#ignored_alter_specifications}.
	 * @param ctx the parse tree
	 */
	void exitIgnored_alter_specifications(mysqlParser.Ignored_alter_specificationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#algorithm_type}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithm_type(mysqlParser.Algorithm_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#algorithm_type}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithm_type(mysqlParser.Algorithm_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#lock_type}.
	 * @param ctx the parse tree
	 */
	void enterLock_type(mysqlParser.Lock_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#lock_type}.
	 * @param ctx the parse tree
	 */
	void exitLock_type(mysqlParser.Lock_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#partition_names}.
	 * @param ctx the parse tree
	 */
	void enterPartition_names(mysqlParser.Partition_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#partition_names}.
	 * @param ctx the parse tree
	 */
	void exitPartition_names(mysqlParser.Partition_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#alter_ordering}.
	 * @param ctx the parse tree
	 */
	void enterAlter_ordering(mysqlParser.Alter_orderingContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#alter_ordering}.
	 * @param ctx the parse tree
	 */
	void exitAlter_ordering(mysqlParser.Alter_orderingContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#alter_ordering_column}.
	 * @param ctx the parse tree
	 */
	void enterAlter_ordering_column(mysqlParser.Alter_ordering_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#alter_ordering_column}.
	 * @param ctx the parse tree
	 */
	void exitAlter_ordering_column(mysqlParser.Alter_ordering_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumn_definition(mysqlParser.Column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumn_definition(mysqlParser.Column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#col_position}.
	 * @param ctx the parse tree
	 */
	void enterCol_position(mysqlParser.Col_positionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#col_position}.
	 * @param ctx the parse tree
	 */
	void exitCol_position(mysqlParser.Col_positionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(mysqlParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(mysqlParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#generic_type}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_type(mysqlParser.Generic_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#generic_type}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_type(mysqlParser.Generic_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#signed_type}.
	 * @param ctx the parse tree
	 */
	void enterSigned_type(mysqlParser.Signed_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#signed_type}.
	 * @param ctx the parse tree
	 */
	void exitSigned_type(mysqlParser.Signed_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#string_type}.
	 * @param ctx the parse tree
	 */
	void enterString_type(mysqlParser.String_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#string_type}.
	 * @param ctx the parse tree
	 */
	void exitString_type(mysqlParser.String_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#long_flag}.
	 * @param ctx the parse tree
	 */
	void enterLong_flag(mysqlParser.Long_flagContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#long_flag}.
	 * @param ctx the parse tree
	 */
	void exitLong_flag(mysqlParser.Long_flagContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#enumerated_type}.
	 * @param ctx the parse tree
	 */
	void enterEnumerated_type(mysqlParser.Enumerated_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#enumerated_type}.
	 * @param ctx the parse tree
	 */
	void exitEnumerated_type(mysqlParser.Enumerated_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#column_options}.
	 * @param ctx the parse tree
	 */
	void enterColumn_options(mysqlParser.Column_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#column_options}.
	 * @param ctx the parse tree
	 */
	void exitColumn_options(mysqlParser.Column_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#primary_key}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_key(mysqlParser.Primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#primary_key}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_key(mysqlParser.Primary_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#enumerated_values}.
	 * @param ctx the parse tree
	 */
	void enterEnumerated_values(mysqlParser.Enumerated_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#enumerated_values}.
	 * @param ctx the parse tree
	 */
	void exitEnumerated_values(mysqlParser.Enumerated_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#enum_value}.
	 * @param ctx the parse tree
	 */
	void enterEnum_value(mysqlParser.Enum_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#enum_value}.
	 * @param ctx the parse tree
	 */
	void exitEnum_value(mysqlParser.Enum_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#charset_def}.
	 * @param ctx the parse tree
	 */
	void enterCharset_def(mysqlParser.Charset_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#charset_def}.
	 * @param ctx the parse tree
	 */
	void exitCharset_def(mysqlParser.Charset_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#character_set}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_set(mysqlParser.Character_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#character_set}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_set(mysqlParser.Character_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#nullability}.
	 * @param ctx the parse tree
	 */
	void enterNullability(mysqlParser.NullabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#nullability}.
	 * @param ctx the parse tree
	 */
	void exitNullability(mysqlParser.NullabilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#default_value}.
	 * @param ctx the parse tree
	 */
	void enterDefault_value(mysqlParser.Default_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#default_value}.
	 * @param ctx the parse tree
	 */
	void exitDefault_value(mysqlParser.Default_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#length}.
	 * @param ctx the parse tree
	 */
	void enterLength(mysqlParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#length}.
	 * @param ctx the parse tree
	 */
	void exitLength(mysqlParser.LengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#int_flags}.
	 * @param ctx the parse tree
	 */
	void enterInt_flags(mysqlParser.Int_flagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#int_flags}.
	 * @param ctx the parse tree
	 */
	void exitInt_flags(mysqlParser.Int_flagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#decimal_length}.
	 * @param ctx the parse tree
	 */
	void enterDecimal_length(mysqlParser.Decimal_lengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#decimal_length}.
	 * @param ctx the parse tree
	 */
	void exitDecimal_length(mysqlParser.Decimal_lengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#now_function}.
	 * @param ctx the parse tree
	 */
	void enterNow_function(mysqlParser.Now_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#now_function}.
	 * @param ctx the parse tree
	 */
	void exitNow_function(mysqlParser.Now_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#current_timestamp_length}.
	 * @param ctx the parse tree
	 */
	void enterCurrent_timestamp_length(mysqlParser.Current_timestamp_lengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#current_timestamp_length}.
	 * @param ctx the parse tree
	 */
	void exitCurrent_timestamp_length(mysqlParser.Current_timestamp_lengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#localtime_function}.
	 * @param ctx the parse tree
	 */
	void enterLocaltime_function(mysqlParser.Localtime_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#localtime_function}.
	 * @param ctx the parse tree
	 */
	void exitLocaltime_function(mysqlParser.Localtime_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#partition_by}.
	 * @param ctx the parse tree
	 */
	void enterPartition_by(mysqlParser.Partition_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#partition_by}.
	 * @param ctx the parse tree
	 */
	void exitPartition_by(mysqlParser.Partition_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#partition_by_what}.
	 * @param ctx the parse tree
	 */
	void enterPartition_by_what(mysqlParser.Partition_by_whatContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#partition_by_what}.
	 * @param ctx the parse tree
	 */
	void exitPartition_by_what(mysqlParser.Partition_by_whatContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#subpartition_by}.
	 * @param ctx the parse tree
	 */
	void enterSubpartition_by(mysqlParser.Subpartition_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#subpartition_by}.
	 * @param ctx the parse tree
	 */
	void exitSubpartition_by(mysqlParser.Subpartition_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#partition_count}.
	 * @param ctx the parse tree
	 */
	void enterPartition_count(mysqlParser.Partition_countContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#partition_count}.
	 * @param ctx the parse tree
	 */
	void exitPartition_count(mysqlParser.Partition_countContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#partition_definitions}.
	 * @param ctx the parse tree
	 */
	void enterPartition_definitions(mysqlParser.Partition_definitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#partition_definitions}.
	 * @param ctx the parse tree
	 */
	void exitPartition_definitions(mysqlParser.Partition_definitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#skip_parens_inside_partition_definitions}.
	 * @param ctx the parse tree
	 */
	void enterSkip_parens_inside_partition_definitions(mysqlParser.Skip_parens_inside_partition_definitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#skip_parens_inside_partition_definitions}.
	 * @param ctx the parse tree
	 */
	void exitSkip_parens_inside_partition_definitions(mysqlParser.Skip_parens_inside_partition_definitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#alter_database}.
	 * @param ctx the parse tree
	 */
	void enterAlter_database(mysqlParser.Alter_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#alter_database}.
	 * @param ctx the parse tree
	 */
	void exitAlter_database(mysqlParser.Alter_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#alter_database_definition}.
	 * @param ctx the parse tree
	 */
	void enterAlter_database_definition(mysqlParser.Alter_database_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#alter_database_definition}.
	 * @param ctx the parse tree
	 */
	void exitAlter_database_definition(mysqlParser.Alter_database_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#create_database}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database(mysqlParser.Create_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#create_database}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database(mysqlParser.Create_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#create_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table(mysqlParser.Create_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#create_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table(mysqlParser.Create_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#create_table_preamble}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_preamble(mysqlParser.Create_table_preambleContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#create_table_preamble}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_preamble(mysqlParser.Create_table_preambleContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#create_specifications}.
	 * @param ctx the parse tree
	 */
	void enterCreate_specifications(mysqlParser.Create_specificationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#create_specifications}.
	 * @param ctx the parse tree
	 */
	void exitCreate_specifications(mysqlParser.Create_specificationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#create_specification}.
	 * @param ctx the parse tree
	 */
	void enterCreate_specification(mysqlParser.Create_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#create_specification}.
	 * @param ctx the parse tree
	 */
	void exitCreate_specification(mysqlParser.Create_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#create_like_tbl}.
	 * @param ctx the parse tree
	 */
	void enterCreate_like_tbl(mysqlParser.Create_like_tblContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#create_like_tbl}.
	 * @param ctx the parse tree
	 */
	void exitCreate_like_tbl(mysqlParser.Create_like_tblContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#table_creation_option}.
	 * @param ctx the parse tree
	 */
	void enterTable_creation_option(mysqlParser.Table_creation_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#table_creation_option}.
	 * @param ctx the parse tree
	 */
	void exitTable_creation_option(mysqlParser.Table_creation_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#creation_engine}.
	 * @param ctx the parse tree
	 */
	void enterCreation_engine(mysqlParser.Creation_engineContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#creation_engine}.
	 * @param ctx the parse tree
	 */
	void exitCreation_engine(mysqlParser.Creation_engineContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#creation_auto_increment}.
	 * @param ctx the parse tree
	 */
	void enterCreation_auto_increment(mysqlParser.Creation_auto_incrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#creation_auto_increment}.
	 * @param ctx the parse tree
	 */
	void exitCreation_auto_increment(mysqlParser.Creation_auto_incrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#creation_avg_row_length}.
	 * @param ctx the parse tree
	 */
	void enterCreation_avg_row_length(mysqlParser.Creation_avg_row_lengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#creation_avg_row_length}.
	 * @param ctx the parse tree
	 */
	void exitCreation_avg_row_length(mysqlParser.Creation_avg_row_lengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#creation_character_set}.
	 * @param ctx the parse tree
	 */
	void enterCreation_character_set(mysqlParser.Creation_character_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#creation_character_set}.
	 * @param ctx the parse tree
	 */
	void exitCreation_character_set(mysqlParser.Creation_character_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#creation_checksum}.
	 * @param ctx the parse tree
	 */
	void enterCreation_checksum(mysqlParser.Creation_checksumContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#creation_checksum}.
	 * @param ctx the parse tree
	 */
	void exitCreation_checksum(mysqlParser.Creation_checksumContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#creation_collation}.
	 * @param ctx the parse tree
	 */
	void enterCreation_collation(mysqlParser.Creation_collationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#creation_collation}.
	 * @param ctx the parse tree
	 */
	void exitCreation_collation(mysqlParser.Creation_collationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#creation_comment}.
	 * @param ctx the parse tree
	 */
	void enterCreation_comment(mysqlParser.Creation_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#creation_comment}.
	 * @param ctx the parse tree
	 */
	void exitCreation_comment(mysqlParser.Creation_commentContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#creation_connection}.
	 * @param ctx the parse tree
	 */
	void enterCreation_connection(mysqlParser.Creation_connectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#creation_connection}.
	 * @param ctx the parse tree
	 */
	void exitCreation_connection(mysqlParser.Creation_connectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#creation_data_directory}.
	 * @param ctx the parse tree
	 */
	void enterCreation_data_directory(mysqlParser.Creation_data_directoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#creation_data_directory}.
	 * @param ctx the parse tree
	 */
	void exitCreation_data_directory(mysqlParser.Creation_data_directoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#creation_delay_key_write}.
	 * @param ctx the parse tree
	 */
	void enterCreation_delay_key_write(mysqlParser.Creation_delay_key_writeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#creation_delay_key_write}.
	 * @param ctx the parse tree
	 */
	void exitCreation_delay_key_write(mysqlParser.Creation_delay_key_writeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#creation_index_directory}.
	 * @param ctx the parse tree
	 */
	void enterCreation_index_directory(mysqlParser.Creation_index_directoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#creation_index_directory}.
	 * @param ctx the parse tree
	 */
	void exitCreation_index_directory(mysqlParser.Creation_index_directoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#creation_insert_method}.
	 * @param ctx the parse tree
	 */
	void enterCreation_insert_method(mysqlParser.Creation_insert_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#creation_insert_method}.
	 * @param ctx the parse tree
	 */
	void exitCreation_insert_method(mysqlParser.Creation_insert_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#creation_key_block_size}.
	 * @param ctx the parse tree
	 */
	void enterCreation_key_block_size(mysqlParser.Creation_key_block_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#creation_key_block_size}.
	 * @param ctx the parse tree
	 */
	void exitCreation_key_block_size(mysqlParser.Creation_key_block_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#creation_max_rows}.
	 * @param ctx the parse tree
	 */
	void enterCreation_max_rows(mysqlParser.Creation_max_rowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#creation_max_rows}.
	 * @param ctx the parse tree
	 */
	void exitCreation_max_rows(mysqlParser.Creation_max_rowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#creation_min_rows}.
	 * @param ctx the parse tree
	 */
	void enterCreation_min_rows(mysqlParser.Creation_min_rowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#creation_min_rows}.
	 * @param ctx the parse tree
	 */
	void exitCreation_min_rows(mysqlParser.Creation_min_rowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#creation_pack_keys}.
	 * @param ctx the parse tree
	 */
	void enterCreation_pack_keys(mysqlParser.Creation_pack_keysContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#creation_pack_keys}.
	 * @param ctx the parse tree
	 */
	void exitCreation_pack_keys(mysqlParser.Creation_pack_keysContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#creation_password}.
	 * @param ctx the parse tree
	 */
	void enterCreation_password(mysqlParser.Creation_passwordContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#creation_password}.
	 * @param ctx the parse tree
	 */
	void exitCreation_password(mysqlParser.Creation_passwordContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#creation_row_format}.
	 * @param ctx the parse tree
	 */
	void enterCreation_row_format(mysqlParser.Creation_row_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#creation_row_format}.
	 * @param ctx the parse tree
	 */
	void exitCreation_row_format(mysqlParser.Creation_row_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#creation_stats_auto_recalc}.
	 * @param ctx the parse tree
	 */
	void enterCreation_stats_auto_recalc(mysqlParser.Creation_stats_auto_recalcContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#creation_stats_auto_recalc}.
	 * @param ctx the parse tree
	 */
	void exitCreation_stats_auto_recalc(mysqlParser.Creation_stats_auto_recalcContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#creation_stats_persistent}.
	 * @param ctx the parse tree
	 */
	void enterCreation_stats_persistent(mysqlParser.Creation_stats_persistentContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#creation_stats_persistent}.
	 * @param ctx the parse tree
	 */
	void exitCreation_stats_persistent(mysqlParser.Creation_stats_persistentContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#creation_stats_sample_pages}.
	 * @param ctx the parse tree
	 */
	void enterCreation_stats_sample_pages(mysqlParser.Creation_stats_sample_pagesContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#creation_stats_sample_pages}.
	 * @param ctx the parse tree
	 */
	void exitCreation_stats_sample_pages(mysqlParser.Creation_stats_sample_pagesContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#creation_storage_option}.
	 * @param ctx the parse tree
	 */
	void enterCreation_storage_option(mysqlParser.Creation_storage_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#creation_storage_option}.
	 * @param ctx the parse tree
	 */
	void exitCreation_storage_option(mysqlParser.Creation_storage_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#creation_tablespace}.
	 * @param ctx the parse tree
	 */
	void enterCreation_tablespace(mysqlParser.Creation_tablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#creation_tablespace}.
	 * @param ctx the parse tree
	 */
	void exitCreation_tablespace(mysqlParser.Creation_tablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#creation_union}.
	 * @param ctx the parse tree
	 */
	void enterCreation_union(mysqlParser.Creation_unionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#creation_union}.
	 * @param ctx the parse tree
	 */
	void exitCreation_union(mysqlParser.Creation_unionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#index_definition}.
	 * @param ctx the parse tree
	 */
	void enterIndex_definition(mysqlParser.Index_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#index_definition}.
	 * @param ctx the parse tree
	 */
	void exitIndex_definition(mysqlParser.Index_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#index_type_1}.
	 * @param ctx the parse tree
	 */
	void enterIndex_type_1(mysqlParser.Index_type_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#index_type_1}.
	 * @param ctx the parse tree
	 */
	void exitIndex_type_1(mysqlParser.Index_type_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#index_type_pk}.
	 * @param ctx the parse tree
	 */
	void enterIndex_type_pk(mysqlParser.Index_type_pkContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#index_type_pk}.
	 * @param ctx the parse tree
	 */
	void exitIndex_type_pk(mysqlParser.Index_type_pkContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#index_type_3}.
	 * @param ctx the parse tree
	 */
	void enterIndex_type_3(mysqlParser.Index_type_3Context ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#index_type_3}.
	 * @param ctx the parse tree
	 */
	void exitIndex_type_3(mysqlParser.Index_type_3Context ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#index_type_4}.
	 * @param ctx the parse tree
	 */
	void enterIndex_type_4(mysqlParser.Index_type_4Context ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#index_type_4}.
	 * @param ctx the parse tree
	 */
	void exitIndex_type_4(mysqlParser.Index_type_4Context ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#index_type_5}.
	 * @param ctx the parse tree
	 */
	void enterIndex_type_5(mysqlParser.Index_type_5Context ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#index_type_5}.
	 * @param ctx the parse tree
	 */
	void exitIndex_type_5(mysqlParser.Index_type_5Context ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#index_type_check}.
	 * @param ctx the parse tree
	 */
	void enterIndex_type_check(mysqlParser.Index_type_checkContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#index_type_check}.
	 * @param ctx the parse tree
	 */
	void exitIndex_type_check(mysqlParser.Index_type_checkContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#index_or_key}.
	 * @param ctx the parse tree
	 */
	void enterIndex_or_key(mysqlParser.Index_or_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#index_or_key}.
	 * @param ctx the parse tree
	 */
	void exitIndex_or_key(mysqlParser.Index_or_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#index_constraint}.
	 * @param ctx the parse tree
	 */
	void enterIndex_constraint(mysqlParser.Index_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#index_constraint}.
	 * @param ctx the parse tree
	 */
	void exitIndex_constraint(mysqlParser.Index_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#constraint_name}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_name(mysqlParser.Constraint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#constraint_name}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_name(mysqlParser.Constraint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(mysqlParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(mysqlParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#index_type}.
	 * @param ctx the parse tree
	 */
	void enterIndex_type(mysqlParser.Index_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#index_type}.
	 * @param ctx the parse tree
	 */
	void exitIndex_type(mysqlParser.Index_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#index_options}.
	 * @param ctx the parse tree
	 */
	void enterIndex_options(mysqlParser.Index_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#index_options}.
	 * @param ctx the parse tree
	 */
	void exitIndex_options(mysqlParser.Index_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#index_column_list}.
	 * @param ctx the parse tree
	 */
	void enterIndex_column_list(mysqlParser.Index_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#index_column_list}.
	 * @param ctx the parse tree
	 */
	void exitIndex_column_list(mysqlParser.Index_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#index_columns}.
	 * @param ctx the parse tree
	 */
	void enterIndex_columns(mysqlParser.Index_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#index_columns}.
	 * @param ctx the parse tree
	 */
	void exitIndex_columns(mysqlParser.Index_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#index_column}.
	 * @param ctx the parse tree
	 */
	void enterIndex_column(mysqlParser.Index_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#index_column}.
	 * @param ctx the parse tree
	 */
	void exitIndex_column(mysqlParser.Index_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#index_column_partial_def}.
	 * @param ctx the parse tree
	 */
	void enterIndex_column_partial_def(mysqlParser.Index_column_partial_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#index_column_partial_def}.
	 * @param ctx the parse tree
	 */
	void exitIndex_column_partial_def(mysqlParser.Index_column_partial_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#index_column_partial_length}.
	 * @param ctx the parse tree
	 */
	void enterIndex_column_partial_length(mysqlParser.Index_column_partial_lengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#index_column_partial_length}.
	 * @param ctx the parse tree
	 */
	void exitIndex_column_partial_length(mysqlParser.Index_column_partial_lengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#index_column_asc_or_desc}.
	 * @param ctx the parse tree
	 */
	void enterIndex_column_asc_or_desc(mysqlParser.Index_column_asc_or_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#index_column_asc_or_desc}.
	 * @param ctx the parse tree
	 */
	void exitIndex_column_asc_or_desc(mysqlParser.Index_column_asc_or_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#reference_definition}.
	 * @param ctx the parse tree
	 */
	void enterReference_definition(mysqlParser.Reference_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#reference_definition}.
	 * @param ctx the parse tree
	 */
	void exitReference_definition(mysqlParser.Reference_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#reference_definition_match}.
	 * @param ctx the parse tree
	 */
	void enterReference_definition_match(mysqlParser.Reference_definition_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#reference_definition_match}.
	 * @param ctx the parse tree
	 */
	void exitReference_definition_match(mysqlParser.Reference_definition_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#reference_definition_on_delete}.
	 * @param ctx the parse tree
	 */
	void enterReference_definition_on_delete(mysqlParser.Reference_definition_on_deleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#reference_definition_on_delete}.
	 * @param ctx the parse tree
	 */
	void exitReference_definition_on_delete(mysqlParser.Reference_definition_on_deleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#reference_definition_on_update}.
	 * @param ctx the parse tree
	 */
	void enterReference_definition_on_update(mysqlParser.Reference_definition_on_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#reference_definition_on_update}.
	 * @param ctx the parse tree
	 */
	void exitReference_definition_on_update(mysqlParser.Reference_definition_on_updateContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#reference_option}.
	 * @param ctx the parse tree
	 */
	void enterReference_option(mysqlParser.Reference_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#reference_option}.
	 * @param ctx the parse tree
	 */
	void exitReference_option(mysqlParser.Reference_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#drop_database}.
	 * @param ctx the parse tree
	 */
	void enterDrop_database(mysqlParser.Drop_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#drop_database}.
	 * @param ctx the parse tree
	 */
	void exitDrop_database(mysqlParser.Drop_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table(mysqlParser.Drop_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table(mysqlParser.Drop_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#drop_table_options}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_options(mysqlParser.Drop_table_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#drop_table_options}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_options(mysqlParser.Drop_table_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#if_exists}.
	 * @param ctx the parse tree
	 */
	void enterIf_exists(mysqlParser.If_existsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#if_exists}.
	 * @param ctx the parse tree
	 */
	void exitIf_exists(mysqlParser.If_existsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#rename_table}.
	 * @param ctx the parse tree
	 */
	void enterRename_table(mysqlParser.Rename_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#rename_table}.
	 * @param ctx the parse tree
	 */
	void exitRename_table(mysqlParser.Rename_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#rename_table_spec}.
	 * @param ctx the parse tree
	 */
	void enterRename_table_spec(mysqlParser.Rename_table_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#rename_table_spec}.
	 * @param ctx the parse tree
	 */
	void exitRename_table_spec(mysqlParser.Rename_table_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#alter_view}.
	 * @param ctx the parse tree
	 */
	void enterAlter_view(mysqlParser.Alter_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#alter_view}.
	 * @param ctx the parse tree
	 */
	void exitAlter_view(mysqlParser.Alter_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#create_view}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view(mysqlParser.Create_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#create_view}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view(mysqlParser.Create_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#drop_view}.
	 * @param ctx the parse tree
	 */
	void enterDrop_view(mysqlParser.Drop_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#drop_view}.
	 * @param ctx the parse tree
	 */
	void exitDrop_view(mysqlParser.Drop_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#view_options}.
	 * @param ctx the parse tree
	 */
	void enterView_options(mysqlParser.View_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#view_options}.
	 * @param ctx the parse tree
	 */
	void exitView_options(mysqlParser.View_optionsContext ctx);
}