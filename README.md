# Projeto Integrador V-B.

# Aplição mobile de monitoramento ambiente.

# O backend atua como o núcleo de processamento e armazenamento, simulando a recepção de dados de sensores e disponibilizando-os via API.

# Funções Principais:
•	Simulação de Dados: Utiliza um serviço agendado (ArduinoMockService) para gerar valores aleatórios e realistas de temperatura, humidade e luminosidade.
•	Persistência de Dados: Recebe os dados simulados e os salva automaticamente no banco de dados através do repository.save(data).
•	Endpoint REST: Expõe o endpoint GET /api/atual que recupera a leitura mais recente do banco de dados para o frontend.
