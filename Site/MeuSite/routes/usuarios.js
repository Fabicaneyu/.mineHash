var express = require('express');
var router = express.Router();
var banco = require('../app-banco');
// não mexa nessas 3 linhas!

router.post('/entrar', function (req, res, next) {

  banco.conectar().then(() => {
    console.log(`Chegou p/ login: ${JSON.stringify(req.body)}`);
    var login = req.body.login_usuario;
    var senha = req.body.senha_usuario; // depois de .body, use o nome (name) do campo em seu formulário de login
    if (login == undefined || senha == undefined) {
      throw new Error(`Dados de login não chegaram completos: ${login} / ${senha}`);
    }
    return banco.sql.query(`select * from tb_minerador where email_minerador='${login}' and senha_minerador='${senha}'`);
  }).then(consulta => {

    console.log(`Usuários encontrados: ${JSON.stringify(consulta.recordset)}`);

    if (consulta.recordset.length == 1) {
      res.send(consulta.recordset[0]);
    } else {
      res.sendStatus(404);
    }

  }).catch(err => {

    var erro = `Erro no login: ${err}`;
    console.error(erro);
    res.status(500).send(erro);

  }).finally(() => {
    banco.sql.close();
  });

});


router.post('/cadastrar', function (req, res, next) {

  // var nome;
  // var login;
  // var senha;

  var nome_usuario;
  var data_usuario;
  var cpf_cnpj_usuario;
  var contato_usuario;
  // var cep;
  // var cidade;
  // var bairro;
  // var uf;
  // var numero_endereco;
  // var rua;
  var senha_usuario;
  var email_usuario;
  var senha_usuario_a;
  // var apelido;







  banco.conectar().then(() => {
    console.log(`Chegou p/ cadastro: ${JSON.stringify(req.body)}`);

    nome_usuario = req.body.nome_usuario; // depois de .body, use o nome (name) do campo em seu formulário de login
    data_usuario = req.body.data_usuario; // depois de .body, use o nome (name) do campo em seu formulário de login
    cpf_cnpj_usuario = req.body.cpf_cnpj_usuario; // depois de .body, use o nome (name) do campo em seu formulário de login
    contato_usuario = req.body.contato_usuario; // depois de .body, use o nome (name) do campo em seu formulário de login
    // cep = req.body.cep; // depois de .body, use o nome (name) do campo em seu formulário de login
    // cidade = req.body.cidade; // depois de .body, use o nome (name) do campo em seu formulário de login
    // bairro = req.body.bairro; // depois de .body, use o nome (name) do campo em seu formulário de login
    // uf = req.body.uf; // depois de .body, use o nome (name) do campo em seu formulário de login
    // numero_endereco = req.body.numero_endereco; // depois de .body, use o nome (name) do campo em seu formulário de login
    // rua = req.body.rua; // depois de .body, use o nome (name) do campo em seu formulário de login
    senha_usuario = req.body.senha_usuario; // depois de .body, use o nome (name) do campo em seu formulário de login
    email_usuario = req.body.email_usuario; // depois de .body, use o nome (name) do campo em seu formulário de login
    // apelido = req.body.apelido;






    if (nome_usuario == undefined || data_usuario == undefined || cpf_cnpj_usuario == undefined ||
      contato_usuario == undefined || senha_usuario == undefined || email_usuario == undefined) {
      // coloque a frase de erro que quiser aqui. Ela vai aparecer no formulário de cadastro
      throw new Error(`Dados de cadastro não chegaram completos`);

    }
    else {

      return banco.sql.query(`insert into Minerador (Nome,dataNascimento,Telefone,CPF,CNPJ,Email,Senha) values
    ('${nome_usuario}','${data_usuario}','${contato_usuario}','${cpf_cnpj_usuario}',null,'${email_usuario}', '${senha_usuario}')`);

    }
  }).then(consulta => {


    res.status(200).send();
    return true;
    console.log(consulta.idMinerador);
    console.log(`Validando cadastro...`);
    console.log('válido!');
    










    // if (consulta.recordset[0] >= 1) {
    //   // res.status(400).send(`Já existe usuário com o login "${login}"`);
    //   res.status(400).send(`Erro 400 ${email_usuario}`);
    //   return;
    // } else {
    //   

    // }

  }).catch(err => {

    console.error(`Erro no cadastro: ${err}`);
    res.status(500).send(`Erro no cadastro: ${err}`);

  }).finally(() => {
    banco.sql.close();
    // if (cadastro_valido) {

    //   banco.sql.query().then(function () {
    //     console.log(`Cadastro criado com sucesso!`);
    //     res.sendStatus(201);
    //     // status 201 significa que algo foi criado no back-end, 
    //     // no caso, um registro de usuário ;)		
    //   }).catch(err => {

    //     var erro = `Erro no cadastro: ${err}`;
    //     console.error(erro);
    //     res.status(500).send(erro);

    //   }).finally(() => {

    //   });
    // }

  });


});


// não mexa nesta linha!
module.exports = router;