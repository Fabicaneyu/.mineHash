const ctx = document.getElementById('exampleChart').getContext('2d');
  const months = [
    'Janeiro',
    'Fevereiro',
    'Marco',
    'Abril',
    'Maio',
    'Junho',
    'Julho',
    'Agosto',
    'Setembro',
    'Outubro',
    'Novembro',
    'Dezembro'
  ];

  function calc() {
    const userData = [];

    for (let i = 0; i < 12; i++) {
      const mathResult = Math.random() * (101 - 1) + 1;
      userData.push(Number(mathResult).toFixed(2));
    }
    return userData;
  }

  const chart = new Chart(ctx, {
    type: 'bar',
    data: {
      labels: months,
      datasets: [{
        label: 'Atual',
        data: calc(),
        backgroundColor: '#15919B'
      }, {
        label: 'Ano passado',
        data: calc(),
        backgroundColor: '#33333F'
      }]
    },
    options: {
      labels: {
        position: 'bottom'
      },
      scales: {
        xAxes: [{
          display: true
        }],
        yAxes: [{
          display: true,
          ticks: {
            max: 100
          }
        }]
      }
    }
  });

  for (let i = 0; i <= 3; i++) {
    const startValue = document.getElementsByClassName(`detail-value-start`)[i];
    const endValue = document.getElementsByClassName(`detail-value-end`)[i];

    if (i == 0) {
      startValue.innerHTML += `${Number(Math.random() * (59 - 1) + 1).toFixed(2)}`;
      endValue.innerHTML += `${Number(Math.random() * (101 - 60) + 60).toFixed(2)}<strong>%</strong>`;
    } else if (i == 1) {
      startValue.innerHTML += `${Number(Math.random() * (59 - 1) + 1).toFixed(2)}`;
      endValue.innerHTML += `${Number(Math.random() * (101 - 60) + 60).toFixed(2)}<strong>%</strong>`;
    } else if (i == 2) {
      startValue.innerHTML += `${Number(Math.random() * (8 - 4) + 4).toFixed(2)}`;
      endValue.innerHTML += `${Number(Math.random() * (17 - 9) + 9).toFixed(2)} <strong>GB</strong>`;
    } else if (i == 3) {
      startValue.innerHTML += `${Number(Math.random() * (849 - 180) + 180).toFixed(2)}`;
      endValue.innerHTML += `${Number(Math.random() * (1001 - 850) + 850).toFixed(2)} <strong>GB</strong>`;
    }

  }

  function atualizar() {
    chart.data.datasets.forEach(dataset => {
      dataset.data = calc();
    });
    chart.update();

    for (let i = 0; i <= 3; i++) {
      const startValue = document.getElementsByClassName(`detail-value-start`)[i];
      const endValue = document.getElementsByClassName(`detail-value-end`)[i];
      const verify = (a, b, x, title, msg) => {
        if ((b * x) < a) {
          return iziToast.warning({
            title: title,
            message: msg,
          });
        }
      }

      console.log(i);

      if (i == 0) {
        let cpuS = Number(Math.random() * (59 - 1) + 1).toFixed(2);
        let cpuE = Number(Math.random() * (101 - 60) + 60).toFixed(2);
        startValue.innerHTML = `${cpuS}`;
        endValue.innerHTML = `${cpuE}<strong>%</strong>`;
        verify(cpuS, cpuE, 0.5, 'CPU', 'Alerta de temperatura alta na CPU!');
      } else if (i == 1) {
        let gpuS = Number(Math.random() * (59 - 1) + 1).toFixed(2);
        let gpuE = Number(Math.random() * (101 - 60) + 60).toFixed(2);
        startValue.innerHTML = `${gpuS}`;
        endValue.innerHTML = `${gpuE}<strong>%</strong>`;
        verify(gpuS, gpuE, 0.5, 'GPU', 'Alerta de temperatura alta na GPU!');
      } else if (i == 2) {
        let ramS = Number(Math.random() * (11 - 4) + 4).toFixed(2);
        let ramE = Number(Math.random() * (17 - 12) + 12).toFixed(2);
        startValue.innerHTML = `${ramS}`;
        endValue.innerHTML = `${ramE} <strong>GB</strong>`;
        verify(ramS, ramE, 0.8, 'RAM', 'Alerta de consumo excessivo de Memória RAM!');
      } else if (i == 3) {
        let hddS = Number(Math.random() * (849 - 180) + 180).toFixed(2);
        let hddE = Number(Math.random() * (1001 - 850) + 850).toFixed(2);
        startValue.innerHTML = `${hddS}`;
        endValue.innerHTML = `${hddE} <strong>GB</strong>`;
        verify(hddS, hddE, 0.8, 'HDD/SSD', 'Há pouco espaco na sua unidade de Armazenamento!');
      }

    }
  }
