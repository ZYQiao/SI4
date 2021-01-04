/* A Bison parser, made by GNU Bison 2.3.  */

/* Skeleton interface for Bison's Yacc-like parsers in C

   Copyright (C) 1984, 1989, 1990, 2000, 2001, 2002, 2003, 2004, 2005, 2006
   Free Software Foundation, Inc.

   This program is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 2, or (at your option)
   any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program; if not, write to the Free Software
   Foundation, Inc., 51 Franklin Street, Fifth Floor,
   Boston, MA 02110-1301, USA.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.

   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* Tokens.  */
#ifndef YYTOKENTYPE
# define YYTOKENTYPE
   /* Put the tokens into the symbol table, so that GDB and other debuggers
      know about them.  */
   enum yytokentype {
     INTEGER = 258,
     BOOLEAN = 259,
     FLOAT = 260,
     STRING = 261,
     IDENTIFIER = 262,
     KWHILE = 263,
     KIF = 264,
     KPRINT = 265,
     KRETURN = 266,
     KBREAK = 267,
     KFOR = 268,
     KSWITCH = 269,
     KCASE = 270,
     KDEFAULT = 271,
     KTRY = 272,
     KCATCH = 273,
     KFINALLY = 274,
     KTHROW = 275,
     TINT = 276,
     TFLOAT = 277,
     TBOOL = 278,
     TSTRING = 279,
     TVOID = 280,
     IFX = 281,
     KELSE = 282,
     DE = 283,
     MTE = 284,
     ME = 285,
     PE = 286,
     KOR = 287,
     KAND = 288,
     LE = 289,
     GE = 290,
     NE = 291,
     EQ = 292,
     UMINUS = 293,
     KNOT = 294,
     MM = 295,
     PP = 296,
     POW = 297
   };
#endif
/* Tokens.  */
#define INTEGER 258
#define BOOLEAN 259
#define FLOAT 260
#define STRING 261
#define IDENTIFIER 262
#define KWHILE 263
#define KIF 264
#define KPRINT 265
#define KRETURN 266
#define KBREAK 267
#define KFOR 268
#define KSWITCH 269
#define KCASE 270
#define KDEFAULT 271
#define KTRY 272
#define KCATCH 273
#define KFINALLY 274
#define KTHROW 275
#define TINT 276
#define TFLOAT 277
#define TBOOL 278
#define TSTRING 279
#define TVOID 280
#define IFX 281
#define KELSE 282
#define DE 283
#define MTE 284
#define ME 285
#define PE 286
#define KOR 287
#define KAND 288
#define LE 289
#define GE 290
#define NE 291
#define EQ 292
#define UMINUS 293
#define KNOT 294
#define MM 295
#define PP 296
#define POW 297




#if ! defined YYSTYPE && ! defined YYSTYPE_IS_DECLARED
typedef union YYSTYPE
#line 73 "syntax.y"
{
    int int_value;              // constant integer or boolean value
    float float_value;          // constant float value
    char *string_value;         // constant string value
    char *ident;                // identifier
    List lst;                   // used for lists of parameters (formal or effective)
    ast_node *ast;              // node pointer
}
/* Line 1529 of yacc.c.  */
#line 142 "syntax.h"
	YYSTYPE;
# define yystype YYSTYPE /* obsolescent; will be withdrawn */
# define YYSTYPE_IS_DECLARED 1
# define YYSTYPE_IS_TRIVIAL 1
#endif

extern YYSTYPE yylval;

