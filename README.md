# Backend-dev-challenge

2iBi Backend Developer Challenge.

# 0.0

- Primeiramente, quero agradecer pela a oportunidade!

# INICIO

- Está API foi desenvolvida em Java usando Spring-Boot, e é uma api totalmente restful.
- Para usar este mesmo projecto em seu ambiente, deve possuir a versão (no minímo) v11 do Java Development Kit (JDK).
- Está API obedece aos padrões MVC (Model, View e Controller)
- Foi usada uma base de dados relacional (MySQL)

Para a visualização dos dados de forma mais user-friendly, também desenvolvi uma interface front-end com o Angular (que também pode ser encontrado aqui no meu github pelo link: https://github.com/MelvinNunes/SimpleAddCountry.git ou pela app já em produção:  )

# ENDPOINTS

Obedecendo aos critérios préviamente colocados, a API:

- Deve ser possível criar um novo país a partir da API criada com todas as suas propriedades (identificador – gerado automaticamente, nome, capital, região, sub-região, área);
Para cumprimento desse ponto, existe o endpoint:

https://paises2ibi.herokuapp.com/api/paises/add

Passamos um objecto "País" pelo body e juntamente com a url

- Deve ser possível listar todos os países anteriormente criados;

https://paises2ibi.herokuapp.com/api/paises/all

- Deve ser possível modificar os dados de um país anteriormente criado;

https://paises2ibi.herokuapp.com/api/paises/update

Passamos um objecto "País" pelo body e juntamente com a url

- Deve ser possível eliminar um país anteriormente criado;

https://paises2ibi.herokuapp.com/api/paises/delete/{id}

Sendo {id} o id do País a ser deletado, e é passada directamente na url

- Deve ser possível ordenar a lista dos países por qualquer uma das suas propriedades.

https://paises2ibi.herokuapp.com/api/paises//orderBy={value}

Sendo {value} a propriedade que pretendemos que seja ordenada, e é passada directamente na url

- NB: Todo o CRUD poderia ter sido feito em um único endpoint, mas achei mais legível diferencia-los
