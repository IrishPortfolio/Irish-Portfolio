let pokemonList = [];

function addPokemon() {
  const pokemon = {
    id: document.getElementById("pokemonId").value,
    name: document.getElementById("pokemonName").value,
    type: document.getElementById("pokemonType").value,
    height: document.getElementById("pokemonHeight").value,
    weight: document.getElementById("pokemonWeight").value,
    description: document.getElementById("pokemonDesc").value
  };

  pokemonList.push(pokemon);
  displayPokemon(pokemonList);

  // Clear inputs
  document.getElementById("pokemonId").value = "";
  document.getElementById("pokemonName").value = "";
  document.getElementById("pokemonType").value = "";
  document.getElementById("pokemonHeight").value = "";
  document.getElementById("pokemonWeight").value = "";
  document.getElementById("pokemonDesc").value = "";
}

function deletePokemonById(id) {
  pokemonList = pokemonList.filter(p => p.id !== id);
  displayPokemon(pokemonList);
}

function searchPokemon() {
  const searchValue = document.getElementById("searchInput").value.toLowerCase();
  const results = pokemonList.filter(p => p.name.toLowerCase().includes(searchValue));
  displayPokemon(results);
}

function filterByType() {
  const selectedType = document.getElementById("typeFilter").value;
  if (selectedType === "") {
    displayPokemon(pokemonList);
  } else {
    const filtered = pokemonList.filter(p => p.type.toLowerCase().includes(selectedType.toLowerCase()));
    displayPokemon(filtered);
  }
}

function displayPokemon(list) {
  const tableBody = document.querySelector("#pokemonTable tbody");
  tableBody.innerHTML = "";

  list.forEach(p => {
    const row = document.createElement("tr");
    row.innerHTML = `
      <td>${p.id}</td>
      <td>${p.name}</td>
      <td>${p.type}</td>
      <td>${p.height}</td>
      <td>${p.weight}</td>
      <td>${p.description}</td>
      <td><button onclick="deletePokemonById('${p.id}')">Delete</button></td>
    `;
    tableBody.appendChild(row);
  });
}
