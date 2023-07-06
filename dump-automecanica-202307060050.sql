--
-- PostgreSQL database dump
--

-- Dumped from database version 14.5
-- Dumped by pg_dump version 14.5

-- Started on 2023-07-06 00:50:01

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 3 (class 2615 OID 2200)
-- Name: public; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA public;


ALTER SCHEMA public OWNER TO postgres;

--
-- TOC entry 3554 (class 0 OID 0)
-- Dependencies: 3
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: postgres
--

COMMENT ON SCHEMA public IS 'standard public schema';


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 214 (class 1259 OID 30986)
-- Name: bairro; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.bairro (
    idbairro integer NOT NULL,
    bai_descricao character varying(45) NOT NULL
);


ALTER TABLE public.bairro OWNER TO postgres;

--
-- TOC entry 235 (class 1259 OID 39627)
-- Name: bairro_idbairro__seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.bairro_idbairro__seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.bairro_idbairro__seq OWNER TO postgres;

--
-- TOC entry 3555 (class 0 OID 0)
-- Dependencies: 235
-- Name: bairro_idbairro__seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.bairro_idbairro__seq OWNED BY public.bairro.idbairro;


--
-- TOC entry 222 (class 1259 OID 31093)
-- Name: cargo; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cargo (
    idcargo integer NOT NULL,
    carg_descricao character varying(45) NOT NULL,
    carg_salario double precision NOT NULL
);


ALTER TABLE public.cargo OWNER TO postgres;

--
-- TOC entry 236 (class 1259 OID 39628)
-- Name: cargo_idcargo__seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.cargo_idcargo__seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cargo_idcargo__seq OWNER TO postgres;

--
-- TOC entry 3556 (class 0 OID 0)
-- Dependencies: 236
-- Name: cargo_idcargo__seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.cargo_idcargo__seq OWNED BY public.cargo.idcargo;


--
-- TOC entry 213 (class 1259 OID 30979)
-- Name: cidade; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cidade (
    idcidade integer NOT NULL,
    cid_descricao character varying(45) NOT NULL
);


ALTER TABLE public.cidade OWNER TO postgres;

--
-- TOC entry 237 (class 1259 OID 39629)
-- Name: cidade_idcidade__seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.cidade_idcidade__seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cidade_idcidade__seq OWNER TO postgres;

--
-- TOC entry 3557 (class 0 OID 0)
-- Dependencies: 237
-- Name: cidade_idcidade__seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.cidade_idcidade__seq OWNED BY public.cidade.idcidade;


--
-- TOC entry 210 (class 1259 OID 30958)
-- Name: classificacao; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.classificacao (
    idclassificacao integer NOT NULL,
    clas_descricao character varying(45) NOT NULL
);


ALTER TABLE public.classificacao OWNER TO postgres;

--
-- TOC entry 238 (class 1259 OID 39630)
-- Name: classificacao_idclassificacao__seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.classificacao_idclassificacao__seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.classificacao_idclassificacao__seq OWNER TO postgres;

--
-- TOC entry 3558 (class 0 OID 0)
-- Dependencies: 238
-- Name: classificacao_idclassificacao__seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.classificacao_idclassificacao__seq OWNED BY public.classificacao.idclassificacao;


--
-- TOC entry 219 (class 1259 OID 31044)
-- Name: cliente; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cliente (
    idcliente integer NOT NULL,
    cli_idpessoa integer NOT NULL
);


ALTER TABLE public.cliente OWNER TO postgres;

--
-- TOC entry 251 (class 1259 OID 39648)
-- Name: cliente_idcliente__seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.cliente_idcliente__seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cliente_idcliente__seq OWNER TO postgres;

--
-- TOC entry 3559 (class 0 OID 0)
-- Dependencies: 251
-- Name: cliente_idcliente__seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.cliente_idcliente__seq OWNED BY public.cliente.idcliente;


--
-- TOC entry 209 (class 1259 OID 30951)
-- Name: combustivel; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.combustivel (
    idcombustivel integer NOT NULL,
    comb_descricao character varying(45) NOT NULL
);


ALTER TABLE public.combustivel OWNER TO postgres;

--
-- TOC entry 239 (class 1259 OID 39631)
-- Name: combustivel_idcombustivel__seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.combustivel_idcombustivel__seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.combustivel_idcombustivel__seq OWNER TO postgres;

--
-- TOC entry 3560 (class 0 OID 0)
-- Dependencies: 239
-- Name: combustivel_idcombustivel__seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.combustivel_idcombustivel__seq OWNED BY public.combustivel.idcombustivel;


--
-- TOC entry 224 (class 1259 OID 31115)
-- Name: conserto; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.conserto (
    idconserto integer NOT NULL,
    cons_descricao character varying(255) NOT NULL,
    cons_datainicio date NOT NULL,
    cons_datafim date,
    cons_idveiculo integer NOT NULL,
    cons_idstatus integer NOT NULL,
    cons_idfuncionario integer NOT NULL
);


ALTER TABLE public.conserto OWNER TO postgres;

--
-- TOC entry 240 (class 1259 OID 39632)
-- Name: conserto_idconserto__seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.conserto_idconserto__seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.conserto_idconserto__seq OWNER TO postgres;

--
-- TOC entry 3561 (class 0 OID 0)
-- Dependencies: 240
-- Name: conserto_idconserto__seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.conserto_idconserto__seq OWNED BY public.conserto.idconserto;


--
-- TOC entry 211 (class 1259 OID 30965)
-- Name: cor; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cor (
    idcor integer NOT NULL,
    cor_descricao character varying(45) NOT NULL
);


ALTER TABLE public.cor OWNER TO postgres;

--
-- TOC entry 241 (class 1259 OID 39633)
-- Name: cor_idcor__seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.cor_idcor__seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cor_idcor__seq OWNER TO postgres;

--
-- TOC entry 3562 (class 0 OID 0)
-- Dependencies: 241
-- Name: cor_idcor__seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.cor_idcor__seq OWNED BY public.cor.idcor;


--
-- TOC entry 216 (class 1259 OID 31000)
-- Name: endereco; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.endereco (
    idendereco integer NOT NULL,
    end_numero character varying(45),
    end_cep character varying(45) NOT NULL,
    end_idcidade integer NOT NULL,
    end_idbairro integer NOT NULL,
    end_idlogradouro integer NOT NULL
);


ALTER TABLE public.endereco OWNER TO postgres;

--
-- TOC entry 242 (class 1259 OID 39634)
-- Name: endereco_idendereco__seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.endereco_idendereco__seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.endereco_idendereco__seq OWNER TO postgres;

--
-- TOC entry 3563 (class 0 OID 0)
-- Dependencies: 242
-- Name: endereco_idendereco__seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.endereco_idendereco__seq OWNED BY public.endereco.idendereco;


--
-- TOC entry 228 (class 1259 OID 31155)
-- Name: estoque; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.estoque (
    est_preco double precision NOT NULL,
    est_idproduto integer NOT NULL,
    est_idnota integer NOT NULL,
    est_quantidade integer NOT NULL,
    idestoque integer NOT NULL
);


ALTER TABLE public.estoque OWNER TO postgres;

--
-- TOC entry 231 (class 1259 OID 31454)
-- Name: estoque_idestoque_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.estoque_idestoque_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.estoque_idestoque_seq OWNER TO postgres;

--
-- TOC entry 3564 (class 0 OID 0)
-- Dependencies: 231
-- Name: estoque_idestoque_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.estoque_idestoque_seq OWNED BY public.estoque.idestoque;


--
-- TOC entry 225 (class 1259 OID 31135)
-- Name: fornecedor; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.fornecedor (
    idfornecedor integer NOT NULL,
    for_nomefantasia character varying(45) NOT NULL,
    for_razaosocial character varying(45) NOT NULL,
    for_cnpj character varying(45) NOT NULL,
    for_inscricaoestadual character varying(45) NOT NULL
);


ALTER TABLE public.fornecedor OWNER TO postgres;

--
-- TOC entry 243 (class 1259 OID 39635)
-- Name: fornecedor_idfornecedor__seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.fornecedor_idfornecedor__seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.fornecedor_idfornecedor__seq OWNER TO postgres;

--
-- TOC entry 3565 (class 0 OID 0)
-- Dependencies: 243
-- Name: fornecedor_idfornecedor__seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.fornecedor_idfornecedor__seq OWNED BY public.fornecedor.idfornecedor;


--
-- TOC entry 223 (class 1259 OID 31100)
-- Name: funcionario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.funcionario (
    fun_idcargo integer NOT NULL,
    idfuncionario integer NOT NULL,
    fun_idpessoa integer NOT NULL
);


ALTER TABLE public.funcionario OWNER TO postgres;

--
-- TOC entry 234 (class 1259 OID 31488)
-- Name: funcionario_fun_idpessoa_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.funcionario_fun_idpessoa_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.funcionario_fun_idpessoa_seq OWNER TO postgres;

--
-- TOC entry 3566 (class 0 OID 0)
-- Dependencies: 234
-- Name: funcionario_fun_idpessoa_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.funcionario_fun_idpessoa_seq OWNED BY public.funcionario.fun_idpessoa;


--
-- TOC entry 232 (class 1259 OID 31471)
-- Name: funcionario_idfuncionario_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.funcionario_idfuncionario_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.funcionario_idfuncionario_seq OWNER TO postgres;

--
-- TOC entry 3567 (class 0 OID 0)
-- Dependencies: 232
-- Name: funcionario_idfuncionario_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.funcionario_idfuncionario_seq OWNED BY public.funcionario.idfuncionario;


--
-- TOC entry 215 (class 1259 OID 30993)
-- Name: logradouro; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.logradouro (
    idlogradouro integer NOT NULL,
    log_descricao character varying(45) NOT NULL
);


ALTER TABLE public.logradouro OWNER TO postgres;

--
-- TOC entry 244 (class 1259 OID 39636)
-- Name: logradouro_idlogradouro__seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.logradouro_idlogradouro__seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.logradouro_idlogradouro__seq OWNER TO postgres;

--
-- TOC entry 3568 (class 0 OID 0)
-- Dependencies: 244
-- Name: logradouro_idlogradouro__seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.logradouro_idlogradouro__seq OWNED BY public.logradouro.idlogradouro;


--
-- TOC entry 212 (class 1259 OID 30972)
-- Name: modelo; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.modelo (
    idmodelo integer NOT NULL,
    mod_descricao character varying(45) NOT NULL
);


ALTER TABLE public.modelo OWNER TO postgres;

--
-- TOC entry 245 (class 1259 OID 39637)
-- Name: modelo_idmodelo__seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.modelo_idmodelo__seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.modelo_idmodelo__seq OWNER TO postgres;

--
-- TOC entry 3569 (class 0 OID 0)
-- Dependencies: 245
-- Name: modelo_idmodelo__seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.modelo_idmodelo__seq OWNED BY public.modelo.idmodelo;


--
-- TOC entry 226 (class 1259 OID 31140)
-- Name: nota; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.nota (
    idnota integer NOT NULL,
    nota_datacompra date NOT NULL,
    nota_dataentrada date NOT NULL,
    nota_idfornecedor integer NOT NULL
);


ALTER TABLE public.nota OWNER TO postgres;

--
-- TOC entry 246 (class 1259 OID 39638)
-- Name: nota_idnota__seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.nota_idnota__seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.nota_idnota__seq OWNER TO postgres;

--
-- TOC entry 3570 (class 0 OID 0)
-- Dependencies: 246
-- Name: nota_idnota__seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.nota_idnota__seq OWNED BY public.nota.idnota;


--
-- TOC entry 229 (class 1259 OID 31170)
-- Name: pecasconserto; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.pecasconserto (
    pc_idconserto integer NOT NULL,
    pc_idestoque integer NOT NULL,
    pc_quantidade integer NOT NULL
);


ALTER TABLE public.pecasconserto OWNER TO postgres;

--
-- TOC entry 247 (class 1259 OID 39639)
-- Name: pecasconserto_pc_idconserto__seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.pecasconserto_pc_idconserto__seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.pecasconserto_pc_idconserto__seq OWNER TO postgres;

--
-- TOC entry 3571 (class 0 OID 0)
-- Dependencies: 247
-- Name: pecasconserto_pc_idconserto__seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.pecasconserto_pc_idconserto__seq OWNED BY public.pecasconserto.pc_idconserto;


--
-- TOC entry 217 (class 1259 OID 31020)
-- Name: pessoa; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.pessoa (
    pes_cpf character(11) NOT NULL,
    pes_nome character varying(255) NOT NULL,
    pes_idendereco integer,
    pes_datanasc date NOT NULL,
    pes_email character varying(255),
    idpessoa integer NOT NULL
);


ALTER TABLE public.pessoa OWNER TO postgres;

--
-- TOC entry 233 (class 1259 OID 31478)
-- Name: pessoa_idpessoa_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.pessoa_idpessoa_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.pessoa_idpessoa_seq OWNER TO postgres;

--
-- TOC entry 3572 (class 0 OID 0)
-- Dependencies: 233
-- Name: pessoa_idpessoa_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.pessoa_idpessoa_seq OWNED BY public.pessoa.idpessoa;


--
-- TOC entry 227 (class 1259 OID 31150)
-- Name: produto; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.produto (
    prod_nome character varying(45) NOT NULL,
    prod_validade date NOT NULL,
    idproduto integer NOT NULL
);


ALTER TABLE public.produto OWNER TO postgres;

--
-- TOC entry 230 (class 1259 OID 31442)
-- Name: produto_idproduto_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.produto_idproduto_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.produto_idproduto_seq OWNER TO postgres;

--
-- TOC entry 3573 (class 0 OID 0)
-- Dependencies: 230
-- Name: produto_idproduto_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.produto_idproduto_seq OWNED BY public.produto.idproduto;


--
-- TOC entry 221 (class 1259 OID 31086)
-- Name: status; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.status (
    idstatus integer NOT NULL,
    stat_descricao character varying(45) NOT NULL
);


ALTER TABLE public.status OWNER TO postgres;

--
-- TOC entry 248 (class 1259 OID 39640)
-- Name: status_idstatus__seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.status_idstatus__seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.status_idstatus__seq OWNER TO postgres;

--
-- TOC entry 3574 (class 0 OID 0)
-- Dependencies: 248
-- Name: status_idstatus__seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.status_idstatus__seq OWNED BY public.status.idstatus;


--
-- TOC entry 218 (class 1259 OID 31034)
-- Name: telefone; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.telefone (
    idtelefone integer NOT NULL,
    tel_idpessoa integer NOT NULL,
    tel_codpais character(2) NOT NULL,
    tel_ddd character(2) NOT NULL,
    tel_numero character(9) NOT NULL
);


ALTER TABLE public.telefone OWNER TO postgres;

--
-- TOC entry 249 (class 1259 OID 39641)
-- Name: telefone_idtelefone__seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.telefone_idtelefone__seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.telefone_idtelefone__seq OWNER TO postgres;

--
-- TOC entry 3575 (class 0 OID 0)
-- Dependencies: 249
-- Name: telefone_idtelefone__seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.telefone_idtelefone__seq OWNED BY public.telefone.idtelefone;


--
-- TOC entry 220 (class 1259 OID 31054)
-- Name: veiculo; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.veiculo (
    idveiculo integer NOT NULL,
    vei_datafabric date NOT NULL,
    vei_placa character(8) NOT NULL,
    vei_quilometragem character varying(10) NOT NULL,
    vei_idcombustivel integer NOT NULL,
    vei_idmodelo integer,
    vei_idcor integer NOT NULL,
    vei_idcliente integer NOT NULL,
    vei_idclassificacao integer NOT NULL
);


ALTER TABLE public.veiculo OWNER TO postgres;

--
-- TOC entry 250 (class 1259 OID 39642)
-- Name: veiculo_idveiculo__seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.veiculo_idveiculo__seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.veiculo_idveiculo__seq OWNER TO postgres;

--
-- TOC entry 3576 (class 0 OID 0)
-- Dependencies: 250
-- Name: veiculo_idveiculo__seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.veiculo_idveiculo__seq OWNED BY public.veiculo.idveiculo;


--
-- TOC entry 3270 (class 2604 OID 39643)
-- Name: bairro idbairro; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.bairro ALTER COLUMN idbairro SET DEFAULT nextval('public.bairro_idbairro__seq'::regclass);


--
-- TOC entry 3269 (class 2604 OID 39644)
-- Name: cidade idcidade; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cidade ALTER COLUMN idcidade SET DEFAULT nextval('public.cidade_idcidade__seq'::regclass);


--
-- TOC entry 3266 (class 2604 OID 39652)
-- Name: classificacao idclassificacao; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.classificacao ALTER COLUMN idclassificacao SET DEFAULT nextval('public.classificacao_idclassificacao__seq'::regclass);


--
-- TOC entry 3274 (class 2604 OID 39649)
-- Name: cliente idcliente; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cliente ALTER COLUMN idcliente SET DEFAULT nextval('public.cliente_idcliente__seq'::regclass);


--
-- TOC entry 3265 (class 2604 OID 39655)
-- Name: combustivel idcombustivel; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.combustivel ALTER COLUMN idcombustivel SET DEFAULT nextval('public.combustivel_idcombustivel__seq'::regclass);


--
-- TOC entry 3278 (class 2604 OID 39656)
-- Name: conserto idconserto; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.conserto ALTER COLUMN idconserto SET DEFAULT nextval('public.conserto_idconserto__seq'::regclass);


--
-- TOC entry 3267 (class 2604 OID 39653)
-- Name: cor idcor; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cor ALTER COLUMN idcor SET DEFAULT nextval('public.cor_idcor__seq'::regclass);


--
-- TOC entry 3272 (class 2604 OID 39646)
-- Name: endereco idendereco; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.endereco ALTER COLUMN idendereco SET DEFAULT nextval('public.endereco_idendereco__seq'::regclass);


--
-- TOC entry 3281 (class 2604 OID 31455)
-- Name: estoque idestoque; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.estoque ALTER COLUMN idestoque SET DEFAULT nextval('public.estoque_idestoque_seq'::regclass);


--
-- TOC entry 3279 (class 2604 OID 39647)
-- Name: fornecedor idfornecedor; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.fornecedor ALTER COLUMN idfornecedor SET DEFAULT nextval('public.fornecedor_idfornecedor__seq'::regclass);


--
-- TOC entry 3276 (class 2604 OID 31472)
-- Name: funcionario idfuncionario; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.funcionario ALTER COLUMN idfuncionario SET DEFAULT nextval('public.funcionario_idfuncionario_seq'::regclass);


--
-- TOC entry 3277 (class 2604 OID 31489)
-- Name: funcionario fun_idpessoa; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.funcionario ALTER COLUMN fun_idpessoa SET DEFAULT nextval('public.funcionario_fun_idpessoa_seq'::regclass);


--
-- TOC entry 3271 (class 2604 OID 39645)
-- Name: logradouro idlogradouro; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.logradouro ALTER COLUMN idlogradouro SET DEFAULT nextval('public.logradouro_idlogradouro__seq'::regclass);


--
-- TOC entry 3268 (class 2604 OID 39654)
-- Name: modelo idmodelo; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.modelo ALTER COLUMN idmodelo SET DEFAULT nextval('public.modelo_idmodelo__seq'::regclass);


--
-- TOC entry 3273 (class 2604 OID 31479)
-- Name: pessoa idpessoa; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pessoa ALTER COLUMN idpessoa SET DEFAULT nextval('public.pessoa_idpessoa_seq'::regclass);


--
-- TOC entry 3280 (class 2604 OID 31443)
-- Name: produto idproduto; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.produto ALTER COLUMN idproduto SET DEFAULT nextval('public.produto_idproduto_seq'::regclass);


--
-- TOC entry 3275 (class 2604 OID 39651)
-- Name: veiculo idveiculo; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculo ALTER COLUMN idveiculo SET DEFAULT nextval('public.veiculo_idveiculo__seq'::regclass);


--
-- TOC entry 3511 (class 0 OID 30986)
-- Dependencies: 214
-- Data for Name: bairro; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.bairro (idbairro, bai_descricao) FROM stdin;
1	adm
2	asd
3	teste
4	tes
6	12312
7	sdfsd
8	adn
9	asdd
10	asdasd
11	
12	padre
\.


--
-- TOC entry 3519 (class 0 OID 31093)
-- Dependencies: 222
-- Data for Name: cargo; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.cargo (idcargo, carg_descricao, carg_salario) FROM stdin;
1	Administrador	5000
\.


--
-- TOC entry 3510 (class 0 OID 30979)
-- Dependencies: 213
-- Data for Name: cidade; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.cidade (idcidade, cid_descricao) FROM stdin;
1	ads
2	asd
3	teste
4	tes
5	123
6	324
7	ddd
8	asdasd
9	
10	santa helena
\.


--
-- TOC entry 3507 (class 0 OID 30958)
-- Dependencies: 210
-- Data for Name: classificacao; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.classificacao (idclassificacao, clas_descricao) FROM stdin;
1	23
2	asd
3	123
4	sedan
\.


--
-- TOC entry 3516 (class 0 OID 31044)
-- Dependencies: 219
-- Data for Name: cliente; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.cliente (idcliente, cli_idpessoa) FROM stdin;
1	13
2	14
\.


--
-- TOC entry 3506 (class 0 OID 30951)
-- Dependencies: 209
-- Data for Name: combustivel; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.combustivel (idcombustivel, comb_descricao) FROM stdin;
1	123
2	321
3	gazoza
\.


--
-- TOC entry 3521 (class 0 OID 31115)
-- Dependencies: 224
-- Data for Name: conserto; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.conserto (idconserto, cons_descricao, cons_datainicio, cons_datafim, cons_idveiculo, cons_idstatus, cons_idfuncionario) FROM stdin;
1	teste	2023-07-05	\N	3	1	2
2	oasdasd	2023-07-05	\N	3	1	1
3	Ordem teste	2023-07-05	\N	4	1	2
\.


--
-- TOC entry 3508 (class 0 OID 30965)
-- Dependencies: 211
-- Data for Name: cor; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.cor (idcor, cor_descricao) FROM stdin;
1	22
2	123asd
3	123
4	branca
\.


--
-- TOC entry 3513 (class 0 OID 31000)
-- Dependencies: 216
-- Data for Name: endereco; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.endereco (idendereco, end_numero, end_cep, end_idcidade, end_idbairro, end_idlogradouro) FROM stdin;
1	\N	68903605	3	3	3
2	\N	68903605	3	3	3
8	\N	68903605	5	6	4
9	\N	68903605	5	6	5
10	\N	68903605	5	6	5
11	\N	68903605	5	6	5
12	\N	68903605	5	6	5
13	\N	68903605	5	6	5
14	\N	68903605	8	10	8
15	\N	68903605	8	10	8
16	\N	68903605	8	10	8
17	\N	68903605	8	10	8
18	\N	68903605	10	12	10
\.


--
-- TOC entry 3525 (class 0 OID 31155)
-- Dependencies: 228
-- Data for Name: estoque; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.estoque (est_preco, est_idproduto, est_idnota, est_quantidade, idestoque) FROM stdin;
55	2	222	2	11
2	17	1232	0	12
15	17	1232223	12	13
\.


--
-- TOC entry 3522 (class 0 OID 31135)
-- Dependencies: 225
-- Data for Name: fornecedor; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.fornecedor (idfornecedor, for_nomefantasia, for_razaosocial, for_cnpj, for_inscricaoestadual) FROM stdin;
1	teste	teste	123123	123
2	teste	teste	11111111111111	12312312
\.


--
-- TOC entry 3520 (class 0 OID 31100)
-- Dependencies: 223
-- Data for Name: funcionario; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.funcionario (fun_idcargo, idfuncionario, fun_idpessoa) FROM stdin;
1	1	1
1	2	3
\.


--
-- TOC entry 3512 (class 0 OID 30993)
-- Dependencies: 215
-- Data for Name: logradouro; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.logradouro (idlogradouro, log_descricao) FROM stdin;
1	adm
2	cen
3	teste
4	123
5	asdasd ds
6	324
7	asd
8	asdasdads
9	
10	cedro
11	testeS
\.


--
-- TOC entry 3509 (class 0 OID 30972)
-- Dependencies: 212
-- Data for Name: modelo; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.modelo (idmodelo, mod_descricao) FROM stdin;
1	123
2	sedan
\.


--
-- TOC entry 3523 (class 0 OID 31140)
-- Dependencies: 226
-- Data for Name: nota; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.nota (idnota, nota_datacompra, nota_dataentrada, nota_idfornecedor) FROM stdin;
123	2023-07-13	2023-07-18	2
222	2023-07-13	2023-07-10	2
1232	2023-07-02	2023-07-26	2
1232223	2023-07-14	2023-07-11	2
3343422	2023-07-05	2023-07-21	2
123332	2023-07-13	2023-07-27	2
122323	2023-07-14	2023-07-06	1
\.


--
-- TOC entry 3526 (class 0 OID 31170)
-- Dependencies: 229
-- Data for Name: pecasconserto; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.pecasconserto (pc_idconserto, pc_idestoque, pc_quantidade) FROM stdin;
1	11	1
3	11	3
3	12	1
\.


--
-- TOC entry 3514 (class 0 OID 31020)
-- Dependencies: 217
-- Data for Name: pessoa; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.pessoa (pes_cpf, pes_nome, pes_idendereco, pes_datanasc, pes_email, idpessoa) FROM stdin;
05525587292	Roger	2	2023-07-07	luiz@admi.com	3
11111111111	maasd	8	2023-07-06	asdm@asd.com	4
11111111112	maasdsss	10	2023-07-06	asdm@asd.com	6
11111111132	maasdsss	11	2023-07-06	asdm@asd.com	7
56111111132	maasdsss	13	2023-07-06	asdm@asd.com	9
05577784232	admin	14	2023-07-19	admin@admin.com	10
05577782332	admin	17	2023-07-19	admin@admin.com	13
09573535963	Roger Luis Vicini	18	2003-09-06	roger@roger.com	14
05525587297	Luiz Oseas	2	2002-11-04	luizoseas@lomm.dev.br	1
\.


--
-- TOC entry 3524 (class 0 OID 31150)
-- Dependencies: 227
-- Data for Name: produto; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.produto (prod_nome, prod_validade, idproduto) FROM stdin;
amanha	2022-11-04	2
teste	2023-07-03	8
testeasd	2023-07-19	14
COIFA	2023-07-02	17
\.


--
-- TOC entry 3518 (class 0 OID 31086)
-- Dependencies: 221
-- Data for Name: status; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.status (idstatus, stat_descricao) FROM stdin;
1	Aberto
\.


--
-- TOC entry 3515 (class 0 OID 31034)
-- Dependencies: 218
-- Data for Name: telefone; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.telefone (idtelefone, tel_idpessoa, tel_codpais, tel_ddd, tel_numero) FROM stdin;
\.


--
-- TOC entry 3517 (class 0 OID 31054)
-- Dependencies: 220
-- Data for Name: veiculo; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.veiculo (idveiculo, vei_datafabric, vei_placa, vei_quilometragem, vei_idcombustivel, vei_idmodelo, vei_idcor, vei_idcliente, vei_idclassificacao) FROM stdin;
3	2023-07-13	1234567 	1234567	2	1	3	2	3
4	2023-07-14	7654321 	7654321	3	2	4	2	4
\.


--
-- TOC entry 3577 (class 0 OID 0)
-- Dependencies: 235
-- Name: bairro_idbairro__seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.bairro_idbairro__seq', 12, true);


--
-- TOC entry 3578 (class 0 OID 0)
-- Dependencies: 236
-- Name: cargo_idcargo__seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.cargo_idcargo__seq', 1, false);


--
-- TOC entry 3579 (class 0 OID 0)
-- Dependencies: 237
-- Name: cidade_idcidade__seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.cidade_idcidade__seq', 10, true);


--
-- TOC entry 3580 (class 0 OID 0)
-- Dependencies: 238
-- Name: classificacao_idclassificacao__seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.classificacao_idclassificacao__seq', 4, true);


--
-- TOC entry 3581 (class 0 OID 0)
-- Dependencies: 251
-- Name: cliente_idcliente__seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.cliente_idcliente__seq', 2, true);


--
-- TOC entry 3582 (class 0 OID 0)
-- Dependencies: 239
-- Name: combustivel_idcombustivel__seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.combustivel_idcombustivel__seq', 3, true);


--
-- TOC entry 3583 (class 0 OID 0)
-- Dependencies: 240
-- Name: conserto_idconserto__seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.conserto_idconserto__seq', 3, true);


--
-- TOC entry 3584 (class 0 OID 0)
-- Dependencies: 241
-- Name: cor_idcor__seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.cor_idcor__seq', 4, true);


--
-- TOC entry 3585 (class 0 OID 0)
-- Dependencies: 242
-- Name: endereco_idendereco__seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.endereco_idendereco__seq', 21, true);


--
-- TOC entry 3586 (class 0 OID 0)
-- Dependencies: 231
-- Name: estoque_idestoque_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.estoque_idestoque_seq', 13, true);


--
-- TOC entry 3587 (class 0 OID 0)
-- Dependencies: 243
-- Name: fornecedor_idfornecedor__seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.fornecedor_idfornecedor__seq', 3, true);


--
-- TOC entry 3588 (class 0 OID 0)
-- Dependencies: 234
-- Name: funcionario_fun_idpessoa_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.funcionario_fun_idpessoa_seq', 1, false);


--
-- TOC entry 3589 (class 0 OID 0)
-- Dependencies: 232
-- Name: funcionario_idfuncionario_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.funcionario_idfuncionario_seq', 2, true);


--
-- TOC entry 3590 (class 0 OID 0)
-- Dependencies: 244
-- Name: logradouro_idlogradouro__seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.logradouro_idlogradouro__seq', 11, true);


--
-- TOC entry 3591 (class 0 OID 0)
-- Dependencies: 245
-- Name: modelo_idmodelo__seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.modelo_idmodelo__seq', 2, true);


--
-- TOC entry 3592 (class 0 OID 0)
-- Dependencies: 246
-- Name: nota_idnota__seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.nota_idnota__seq', 2, true);


--
-- TOC entry 3593 (class 0 OID 0)
-- Dependencies: 247
-- Name: pecasconserto_pc_idconserto__seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.pecasconserto_pc_idconserto__seq', 1, false);


--
-- TOC entry 3594 (class 0 OID 0)
-- Dependencies: 233
-- Name: pessoa_idpessoa_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.pessoa_idpessoa_seq', 14, true);


--
-- TOC entry 3595 (class 0 OID 0)
-- Dependencies: 230
-- Name: produto_idproduto_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.produto_idproduto_seq', 17, true);


--
-- TOC entry 3596 (class 0 OID 0)
-- Dependencies: 248
-- Name: status_idstatus__seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.status_idstatus__seq', 1, false);


--
-- TOC entry 3597 (class 0 OID 0)
-- Dependencies: 249
-- Name: telefone_idtelefone__seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.telefone_idtelefone__seq', 1, false);


--
-- TOC entry 3598 (class 0 OID 0)
-- Dependencies: 250
-- Name: veiculo_idveiculo__seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.veiculo_idveiculo__seq', 4, true);


--
-- TOC entry 3303 (class 2606 OID 30992)
-- Name: bairro bairro_bai_descricao_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.bairro
    ADD CONSTRAINT bairro_bai_descricao_key UNIQUE (bai_descricao);


--
-- TOC entry 3305 (class 2606 OID 30990)
-- Name: bairro bairro_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.bairro
    ADD CONSTRAINT bairro_pkey PRIMARY KEY (idbairro);


--
-- TOC entry 3329 (class 2606 OID 31099)
-- Name: cargo cargo_carg_descricao_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cargo
    ADD CONSTRAINT cargo_carg_descricao_key UNIQUE (carg_descricao);


--
-- TOC entry 3331 (class 2606 OID 31097)
-- Name: cargo cargo_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cargo
    ADD CONSTRAINT cargo_pkey PRIMARY KEY (idcargo);


--
-- TOC entry 3299 (class 2606 OID 30985)
-- Name: cidade cidade_cid_descricao_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cidade
    ADD CONSTRAINT cidade_cid_descricao_key UNIQUE (cid_descricao);


--
-- TOC entry 3301 (class 2606 OID 30983)
-- Name: cidade cidade_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cidade
    ADD CONSTRAINT cidade_pkey PRIMARY KEY (idcidade);


--
-- TOC entry 3287 (class 2606 OID 30964)
-- Name: classificacao classificacao_clas_descricao_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.classificacao
    ADD CONSTRAINT classificacao_clas_descricao_key UNIQUE (clas_descricao);


--
-- TOC entry 3289 (class 2606 OID 30962)
-- Name: classificacao classificacao_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.classificacao
    ADD CONSTRAINT classificacao_pkey PRIMARY KEY (idclassificacao);


--
-- TOC entry 3319 (class 2606 OID 31048)
-- Name: cliente cliente_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (idcliente);


--
-- TOC entry 3283 (class 2606 OID 30957)
-- Name: combustivel combustivel_comb_descricao_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.combustivel
    ADD CONSTRAINT combustivel_comb_descricao_key UNIQUE (comb_descricao);


--
-- TOC entry 3285 (class 2606 OID 30955)
-- Name: combustivel combustivel_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.combustivel
    ADD CONSTRAINT combustivel_pkey PRIMARY KEY (idcombustivel);


--
-- TOC entry 3335 (class 2606 OID 31119)
-- Name: conserto conserto_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.conserto
    ADD CONSTRAINT conserto_pkey PRIMARY KEY (idconserto);


--
-- TOC entry 3291 (class 2606 OID 30971)
-- Name: cor cor_cor_descricao_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cor
    ADD CONSTRAINT cor_cor_descricao_key UNIQUE (cor_descricao);


--
-- TOC entry 3293 (class 2606 OID 30969)
-- Name: cor cor_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cor
    ADD CONSTRAINT cor_pkey PRIMARY KEY (idcor);


--
-- TOC entry 3311 (class 2606 OID 31004)
-- Name: endereco endereco_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.endereco
    ADD CONSTRAINT endereco_pkey PRIMARY KEY (idendereco);


--
-- TOC entry 3343 (class 2606 OID 31460)
-- Name: estoque estoque_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.estoque
    ADD CONSTRAINT estoque_pk PRIMARY KEY (idestoque);


--
-- TOC entry 3337 (class 2606 OID 31139)
-- Name: fornecedor fornecedor_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.fornecedor
    ADD CONSTRAINT fornecedor_pkey PRIMARY KEY (idfornecedor);


--
-- TOC entry 3333 (class 2606 OID 31477)
-- Name: funcionario funcionario_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.funcionario
    ADD CONSTRAINT funcionario_pk PRIMARY KEY (idfuncionario);


--
-- TOC entry 3307 (class 2606 OID 30999)
-- Name: logradouro logradouro_log_descricao_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.logradouro
    ADD CONSTRAINT logradouro_log_descricao_key UNIQUE (log_descricao);


--
-- TOC entry 3309 (class 2606 OID 30997)
-- Name: logradouro logradouro_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.logradouro
    ADD CONSTRAINT logradouro_pkey PRIMARY KEY (idlogradouro);


--
-- TOC entry 3295 (class 2606 OID 30978)
-- Name: modelo modelo_mod_descricao_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.modelo
    ADD CONSTRAINT modelo_mod_descricao_key UNIQUE (mod_descricao);


--
-- TOC entry 3297 (class 2606 OID 30976)
-- Name: modelo modelo_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.modelo
    ADD CONSTRAINT modelo_pkey PRIMARY KEY (idmodelo);


--
-- TOC entry 3339 (class 2606 OID 31144)
-- Name: nota nota_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.nota
    ADD CONSTRAINT nota_pkey PRIMARY KEY (idnota);


--
-- TOC entry 3345 (class 2606 OID 31174)
-- Name: pecasconserto pecasconserto_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pecasconserto
    ADD CONSTRAINT pecasconserto_pkey PRIMARY KEY (pc_idconserto, pc_idestoque);


--
-- TOC entry 3313 (class 2606 OID 31028)
-- Name: pessoa pessoa_pes_cpf_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pessoa
    ADD CONSTRAINT pessoa_pes_cpf_key UNIQUE (pes_cpf);


--
-- TOC entry 3315 (class 2606 OID 31487)
-- Name: pessoa pessoa_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pessoa
    ADD CONSTRAINT pessoa_pk PRIMARY KEY (idpessoa);


--
-- TOC entry 3341 (class 2606 OID 31448)
-- Name: produto produto_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.produto
    ADD CONSTRAINT produto_pk PRIMARY KEY (idproduto);


--
-- TOC entry 3325 (class 2606 OID 31090)
-- Name: status status_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.status
    ADD CONSTRAINT status_pkey PRIMARY KEY (idstatus);


--
-- TOC entry 3327 (class 2606 OID 31092)
-- Name: status status_stat_descricao_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.status
    ADD CONSTRAINT status_stat_descricao_key UNIQUE (stat_descricao);


--
-- TOC entry 3317 (class 2606 OID 31038)
-- Name: telefone telefone_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.telefone
    ADD CONSTRAINT telefone_pkey PRIMARY KEY (idtelefone);


--
-- TOC entry 3321 (class 2606 OID 31058)
-- Name: veiculo veiculo_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculo
    ADD CONSTRAINT veiculo_pkey PRIMARY KEY (idveiculo);


--
-- TOC entry 3323 (class 2606 OID 31060)
-- Name: veiculo veiculo_vei_placa_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculo
    ADD CONSTRAINT veiculo_vei_placa_key UNIQUE (vei_placa);


--
-- TOC entry 3360 (class 2606 OID 31125)
-- Name: conserto conserto_cons_idstatus_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.conserto
    ADD CONSTRAINT conserto_cons_idstatus_fkey FOREIGN KEY (cons_idstatus) REFERENCES public.status(idstatus);


--
-- TOC entry 3359 (class 2606 OID 31120)
-- Name: conserto conserto_cons_idveiculo_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.conserto
    ADD CONSTRAINT conserto_cons_idveiculo_fkey FOREIGN KEY (cons_idveiculo) REFERENCES public.veiculo(idveiculo);


--
-- TOC entry 3347 (class 2606 OID 31010)
-- Name: endereco endereco_end_idbairro_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.endereco
    ADD CONSTRAINT endereco_end_idbairro_fkey FOREIGN KEY (end_idbairro) REFERENCES public.bairro(idbairro);


--
-- TOC entry 3346 (class 2606 OID 31005)
-- Name: endereco endereco_end_idcidade_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.endereco
    ADD CONSTRAINT endereco_end_idcidade_fkey FOREIGN KEY (end_idcidade) REFERENCES public.cidade(idcidade);


--
-- TOC entry 3348 (class 2606 OID 31015)
-- Name: endereco endereco_end_idlogradouro_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.endereco
    ADD CONSTRAINT endereco_end_idlogradouro_fkey FOREIGN KEY (end_idlogradouro) REFERENCES public.logradouro(idlogradouro);


--
-- TOC entry 3363 (class 2606 OID 31461)
-- Name: estoque fk_2r3jnso45vimdhasw9u6qspke; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.estoque
    ADD CONSTRAINT fk_2r3jnso45vimdhasw9u6qspke FOREIGN KEY (est_idnota) REFERENCES public.nota(idnota);


--
-- TOC entry 3349 (class 2606 OID 31509)
-- Name: pessoa fk_4dflv9uyqbax4xxmmmklpdtnq; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pessoa
    ADD CONSTRAINT fk_4dflv9uyqbax4xxmmmklpdtnq FOREIGN KEY (pes_idendereco) REFERENCES public.endereco(idendereco);


--
-- TOC entry 3361 (class 2606 OID 31504)
-- Name: conserto fk_ad2l941ehrlifx3sjx8vkdqaf; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.conserto
    ADD CONSTRAINT fk_ad2l941ehrlifx3sjx8vkdqaf FOREIGN KEY (cons_idfuncionario) REFERENCES public.funcionario(idfuncionario);


--
-- TOC entry 3364 (class 2606 OID 31449)
-- Name: estoque fk_dvbgs8q6n61ucdcklav1rnk53; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.estoque
    ADD CONSTRAINT fk_dvbgs8q6n61ucdcklav1rnk53 FOREIGN KEY (est_idproduto) REFERENCES public.produto(idproduto);


--
-- TOC entry 3366 (class 2606 OID 31466)
-- Name: pecasconserto fk_hiv66y4o8kw5gwfs9orgd9k80; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pecasconserto
    ADD CONSTRAINT fk_hiv66y4o8kw5gwfs9orgd9k80 FOREIGN KEY (pc_idestoque) REFERENCES public.estoque(idestoque);


--
-- TOC entry 3350 (class 2606 OID 31514)
-- Name: telefone fk_ltva52o06b1mufra7np13d11a; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.telefone
    ADD CONSTRAINT fk_ltva52o06b1mufra7np13d11a FOREIGN KEY (tel_idpessoa) REFERENCES public.pessoa(idpessoa);


--
-- TOC entry 3351 (class 2606 OID 31499)
-- Name: cliente fk_t6i71rtc6a2qs2alto19xqd2d; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT fk_t6i71rtc6a2qs2alto19xqd2d FOREIGN KEY (cli_idpessoa) REFERENCES public.pessoa(idpessoa);


--
-- TOC entry 3358 (class 2606 OID 31494)
-- Name: funcionario funcionario_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.funcionario
    ADD CONSTRAINT funcionario_fk FOREIGN KEY (fun_idpessoa) REFERENCES public.pessoa(idpessoa);


--
-- TOC entry 3357 (class 2606 OID 31105)
-- Name: funcionario funcionario_fun_idcargo_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.funcionario
    ADD CONSTRAINT funcionario_fun_idcargo_fkey FOREIGN KEY (fun_idcargo) REFERENCES public.cargo(idcargo);


--
-- TOC entry 3362 (class 2606 OID 31145)
-- Name: nota nota_nota_idfornecedor_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.nota
    ADD CONSTRAINT nota_nota_idfornecedor_fkey FOREIGN KEY (nota_idfornecedor) REFERENCES public.fornecedor(idfornecedor);


--
-- TOC entry 3365 (class 2606 OID 31175)
-- Name: pecasconserto pecasconserto_pc_idconserto_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pecasconserto
    ADD CONSTRAINT pecasconserto_pc_idconserto_fkey FOREIGN KEY (pc_idconserto) REFERENCES public.conserto(idconserto);


--
-- TOC entry 3356 (class 2606 OID 31081)
-- Name: veiculo veiculo_vei_idclassificacao_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculo
    ADD CONSTRAINT veiculo_vei_idclassificacao_fkey FOREIGN KEY (vei_idclassificacao) REFERENCES public.classificacao(idclassificacao);


--
-- TOC entry 3355 (class 2606 OID 31076)
-- Name: veiculo veiculo_vei_idcliente_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculo
    ADD CONSTRAINT veiculo_vei_idcliente_fkey FOREIGN KEY (vei_idcliente) REFERENCES public.cliente(idcliente);


--
-- TOC entry 3352 (class 2606 OID 31061)
-- Name: veiculo veiculo_vei_idcombustivel_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculo
    ADD CONSTRAINT veiculo_vei_idcombustivel_fkey FOREIGN KEY (vei_idcombustivel) REFERENCES public.combustivel(idcombustivel);


--
-- TOC entry 3354 (class 2606 OID 31071)
-- Name: veiculo veiculo_vei_idcor_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculo
    ADD CONSTRAINT veiculo_vei_idcor_fkey FOREIGN KEY (vei_idcor) REFERENCES public.cor(idcor);


--
-- TOC entry 3353 (class 2606 OID 31066)
-- Name: veiculo veiculo_vei_idmodelo_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.veiculo
    ADD CONSTRAINT veiculo_vei_idmodelo_fkey FOREIGN KEY (vei_idmodelo) REFERENCES public.modelo(idmodelo);


-- Completed on 2023-07-06 00:50:01

--
-- PostgreSQL database dump complete
--

